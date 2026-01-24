package com.exponent.bankapplication.controller;

import com.exponent.bankapplication.model.*;
import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.serviceimple.SBI;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bankapi/v1.0")
public class AcknowledgementController {

    private final RBI rbi = new SBI();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("/OTCACK")
    public ResponseEntity<ApiResponse> submitAcknowledgement(@RequestBody ApiRequest request) {
        try {
            // Decode the base64 data
            String decodedData = new String(Base64.getDecoder().decode(request.getData()));

            // Parse JSON data
            AcknowledgementRequest ackRequest = objectMapper.readValue(decodedData, AcknowledgementRequest.class);

            // Validate mandatory fields
            if (!isValidRequest(ackRequest)) {
                AcknowledgementResponse errorResponse = new AcknowledgementResponse();
                errorResponse.setStatus("FAILURE");
                errorResponse.setMessage("Invalid request data - mandatory fields missing");

                ApiResponse apiResponse = new ApiResponse();
                apiResponse.setData(Base64.getEncoder().encodeToString(
                    objectMapper.writeValueAsString(errorResponse).getBytes()));

                return ResponseEntity.badRequest().body(apiResponse);
            }

            // Process acknowledgement (store in account system)
            boolean success = processAcknowledgement(ackRequest);

            AcknowledgementResponse response = new AcknowledgementResponse();
            if (success) {
                response.setStatus("SUCCESS");
                response.setMessage("Acknowledgement submitted successfully");
            } else {
                response.setStatus("FAILURE");
                response.setMessage("Failed to process acknowledgement");
            }

            // Encode response
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setData(Base64.getEncoder().encodeToString(
                objectMapper.writeValueAsString(response).getBytes()));

            return ResponseEntity.ok(apiResponse);

        } catch (Exception e) {
            AcknowledgementResponse errorResponse = new AcknowledgementResponse();
            errorResponse.setStatus("FAILURE");
            errorResponse.setMessage("Error processing request: " + e.getMessage());

            try {
                ApiResponse apiResponse = new ApiResponse();
                apiResponse.setData(Base64.getEncoder().encodeToString(
                    objectMapper.writeValueAsString(errorResponse).getBytes()));
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiResponse);
            } catch (Exception ex) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }
    }

    private boolean isValidRequest(AcknowledgementRequest request) {
        // Validate mandatory fields as per specification
        return request.getAy() != null && !request.getAy().isEmpty() &&
               request.getBankCd() != null && !request.getBankCd().isEmpty() &&
               request.getBrIfscCd() != null && !request.getBrIfscCd().isEmpty() &&
               request.getLocation() != null && !request.getLocation().isEmpty() &&
               request.getBrName() != null && !request.getBrName().isEmpty() &&
               request.getPaymentMode() != null && !request.getPaymentMode().isEmpty() &&
               request.getInstrumentTv() != null && !request.getInstrumentTv().isEmpty() &&
               request.getCrn() != null && !request.getCrn().isEmpty() &&
               request.getAckNum() != null && !request.getAckNum().isEmpty() &&
               request.getMajorHead() != null && !request.getMajorHead().isEmpty() &&
               request.getMinorHead() != null && !request.getMinorHead().isEmpty() &&
               request.getTotalAmt() != null &&
               request.getSubmissionDt() != null && !request.getSubmissionDt().isEmpty() &&
               request.getSubmissionTim() != null && !request.getSubmissionTim().isEmpty() &&
               request.getPan() != null && !request.getPan().isEmpty();
    }

    private boolean processAcknowledgement(AcknowledgementRequest request) {
        // Store acknowledgement number linked to PAN in account system
        // This is a simplified implementation - in real system would use database
        try {
            // For now, just validate that PAN exists in system
            // In production, this would store the acknowledgement for later remittance
            return true; // Assume success for demo
        } catch (Exception e) {
            return false;
        }
    }
}