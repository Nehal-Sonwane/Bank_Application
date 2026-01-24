package com.exponent.bankapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcknowledgementRequest {
    @JsonProperty("ay")
    private String ay; // Assessment Year

    @JsonProperty("bank cd")
    private String bankCd; // Bank code

    @JsonProperty("brifsc.cd")
    private String brIfscCd; // IFSC Code

    @JsonProperty("location")
    private String location; // City/Town/Village

    @JsonProperty("br name")
    private String brName; // Branch Name

    @JsonProperty("payment mode")
    private String paymentMode; // Payment mode

    @JsonProperty("instrument tv")
    private String instrumentTv; // Instrument type

    @JsonProperty("instrument num")
    private String instrumentNum; // Cheque/DD Number

    @JsonProperty("instrument micr cd")
    private String instrumentMicrCd; // MICR code

    @JsonProperty("instrument ifsc cd")
    private String instrumentIfscCd; // Instrument IFSC

    @JsonProperty("crn")
    private String crn; // Challan Reference Number

    @JsonProperty("ack num")
    private String ackNum; // Acknowledgement number

    @JsonProperty("major head")
    private String majorHead; // Tax Major head code

    @JsonProperty("minor head")
    private String minorHead; // Tax Minor head code

    @JsonProperty("total amt")
    private Double totalAmt; // Total amount

    @JsonProperty("basic tax")
    private Double basicTax; // Basic Tax

    @JsonProperty("sur charge")
    private Double surCharge; // Surcharge

    @JsonProperty("edu cess")
    private Double eduCess; // Education Cess

    @JsonProperty("interest")
    private Double interest; // Interest

    @JsonProperty("penalty")
    private Double penalty; // Penalty

    @JsonProperty("others")
    private Double others; // Other amounts

    @JsonProperty("submission dt")
    private String submissionDt; // Submission date

    @JsonProperty("submission tim")
    private String submissionTim; // Submission time

    @JsonProperty("pan")
    private String pan; // PAN/TAN number

    // Getters and setters
    public String getAy() { return ay; }
    public void setAy(String ay) { this.ay = ay; }

    public String getBankCd() { return bankCd; }
    public void setBankCd(String bankCd) { this.bankCd = bankCd; }

    public String getBrIfscCd() { return brIfscCd; }
    public void setBrIfscCd(String brIfscCd) { this.brIfscCd = brIfscCd; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getBrName() { return brName; }
    public void setBrName(String brName) { this.brName = brName; }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }

    public String getInstrumentTv() { return instrumentTv; }
    public void setInstrumentTv(String instrumentTv) { this.instrumentTv = instrumentTv; }

    public String getInstrumentNum() { return instrumentNum; }
    public void setInstrumentNum(String instrumentNum) { this.instrumentNum = instrumentNum; }

    public String getInstrumentMicrCd() { return instrumentMicrCd; }
    public void setInstrumentMicrCd(String instrumentMicrCd) { this.instrumentMicrCd = instrumentMicrCd; }

    public String getInstrumentIfscCd() { return instrumentIfscCd; }
    public void setInstrumentIfscCd(String instrumentIfscCd) { this.instrumentIfscCd = instrumentIfscCd; }

    public String getCrn() { return crn; }
    public void setCrn(String crn) { this.crn = crn; }

    public String getAckNum() { return ackNum; }
    public void setAckNum(String ackNum) { this.ackNum = ackNum; }

    public String getMajorHead() { return majorHead; }
    public void setMajorHead(String majorHead) { this.majorHead = majorHead; }

    public String getMinorHead() { return minorHead; }
    public void setMinorHead(String minorHead) { this.minorHead = minorHead; }

    public Double getTotalAmt() { return totalAmt; }
    public void setTotalAmt(Double totalAmt) { this.totalAmt = totalAmt; }

    public Double getBasicTax() { return basicTax; }
    public void setBasicTax(Double basicTax) { this.basicTax = basicTax; }

    public Double getSurCharge() { return surCharge; }
    public void setSurCharge(Double surCharge) { this.surCharge = surCharge; }

    public Double getEduCess() { return eduCess; }
    public void setEduCess(Double eduCess) { this.eduCess = eduCess; }

    public Double getInterest() { return interest; }
    public void setInterest(Double interest) { this.interest = interest; }

    public Double getPenalty() { return penalty; }
    public void setPenalty(Double penalty) { this.penalty = penalty; }

    public Double getOthers() { return others; }
    public void setOthers(Double others) { this.others = others; }

    public String getSubmissionDt() { return submissionDt; }
    public void setSubmissionDt(String submissionDt) { this.submissionDt = submissionDt; }

    public String getSubmissionTim() { return submissionTim; }
    public void setSubmissionTim(String submissionTim) { this.submissionTim = submissionTim; }

    public String getPan() { return pan; }
    public void setPan(String pan) { this.pan = pan; }
}