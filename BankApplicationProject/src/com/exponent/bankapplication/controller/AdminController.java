package com.exponent.bankapplication.controller;

import com.exponent.bankapplication.service.*;
import com.exponent.bankapplication.serviceimple.*;
import java.util.Scanner;

public class AdminController {
	
	public static void main(String[] args) {
		
		System.out.println("********* WELCOME TO SBI *********");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();
		
		while(flag = true){
			System.out.println("|--------------------------|");
			System.out.println("|--------------------------|");
			System.out.println("|1 : Create Bank Account   |");
			System.out.println("|2 : Show Account Details  |");
			System.out.println("|3 : Show account Balance  |");
			System.out.println("|4 : Withdraw Anount       |");
			System.out.println("|5 : Deposite Amount       |");
			System.out.println("|6 : Update Account Details|");
			System.out.println("|7 : Exit                  |");
			System.out.println("|--------------------------|");
			System.out.println("|--------------------------|");
			System.out.println("Enter your Choice between 1-7");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();;
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.withdrawAmount();
				break;
			case 5:
				rbi.depositeAmount();
				break;
			case 6:
				rbi.updatAccountDetails();
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("Enter valid choice------");
				break;
			}
			
		}
	}

}
