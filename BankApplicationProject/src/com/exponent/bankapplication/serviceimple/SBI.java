package com.exponent.bankapplication.serviceimple;

import java.util.Scanner;

import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.service.RBI;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account account[] = new Account[5];

	@Override
	public void createAccount() {
		System.out.println("Enter no of account create");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Account ac = new Account();
			System.out.println("Enter your Account Number");
			int accNo = sc.nextInt();
			ac.setAccountNo(accNo);
			System.out.println("Enter your Name");
			ac.setAccountName(sc.next());
			System.out.println("Enter your Pancard");
			ac.setPancard(sc.next());
			System.out.println("Enter Your aadharcard");
			ac.setAadharcard(sc.nextInt());
			System.out.println("Enter your contact");
			ac.setContact(sc.nextInt());
			System.out.println("Enter Your mail Id");
			ac.setMailId(sc.next());
			System.out.println("Enter your account amount");
			ac.setAccountBalnce(sc.nextDouble());
			account[i] = ac;
			System.out.println("Account Register Sucessfully for" + i + "index");

		}
		System.out.println("Accounts created Sucessfully!!!");

	}

	@Override
	public void showAccountDetails() {
		System.out.println("Enter Your Account No");
		int accNo = sc.nextInt();
		System.out.println("Account holder details:");
		for (Account accobj : account) {
			if (accobj != null) {
				if (accNo == accobj.getAccountNo()) {
					System.out.println(accobj);
				}

			}
		}
	}

	@Override
	public void showAccountBalance() {
		System.out.println("Enter Your Account No");
		int accNo = sc.nextInt();
		for (Account accobj : account) {
			if (accobj != null) {
				if (accobj.getAccountNo() == accNo) {
					System.out.println("Current Account Balance " + accobj.getAccountBalnce());
				}
			}

		}
	}

	@Override
	public void withdrawAmount() {
		System.out.println("Enter Your Withdraw Amount");
		double amt = sc.nextDouble();
		System.out.println("Enter account no:");
		int accNo = sc.nextInt();
		double amount = 0;
		for (Account accobj : account) {
			if (accobj != null) {
				if (accNo == accobj.getAccountNo()) {
					if (accobj.getAccountBalnce() >= amount) {
						amount = accobj.getAccountBalnce() - amt;
						accobj.setAccountBalnce(amount);
						System.out.println("Balance Amount" + amount);
					} else {
						System.out.println("Insufficient Account Balance-----");
					}
				}
			}
		}
	}

	@Override
	public void depositeAmount() {
		System.out.println("Enter Your deposit Amount");
		double amt = sc.nextDouble();
		System.out.println("Enter account no:");
		int accNo = sc.nextInt();
		for (Account accobj : account) {
			if (accobj != null) {
				if (accNo == accobj.getAccountNo()) {
					double amount = accobj.getAccountBalnce() + amt;
					accobj.setAccountBalnce(amount);
					System.out.println("Account Balance" + amount);
				}
			}
		}
	}

	@Override
	public void updatAccountDetails() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter account no:");
		int accNo = sc.nextInt();
		for(Account accobj : account) {
			if(accobj != null) {
				if(accNo == accobj.getAccountNo()) {
					while (flag) {
						System.out.println("1 : Update Name");
						System.out.println("2 : Update Contact");
						System.out.println("3 : Update Email");
						System.out.println("4 : Exit");
						System.out.println("Enter your choice between 1-3");
						int ch = sc.nextInt();
						switch(ch) {
						case 1:
							System.out.println("Enter your Name");
							String upName = sc.next();
							accobj.setAccountName(upName);
							System.out.println("Updated Name " + upName);
							System.out.println("Update sucessfully!!!");
							break;
						case 2:
							System.out.println("Enter your contact");
							long upContact = sc.nextLong();
							accobj.setContact(upContact);
							System.out.println("Updated Contact " + upContact);
							System.out.println("Update sucessfully!!!");
							break;
						case 3:
							System.out.println("Enter your Email");
							String upEmail = sc.next();
							accobj.setMailId(upEmail);
							System.out.println("Updated Name " + upEmail);
							System.out.println("Update sucessfully!!!");
							break;
						case 4:
							flag = false;
							break;
						default:
							System.out.println("Enter your valid choice------");
							break;							
						}
				}
		
		}
	}
  }	
}
}
