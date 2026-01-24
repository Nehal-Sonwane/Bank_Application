package com.exponent.bankapplication.model;

public class Account {
	
	private int accountNo;
	private String accountName;
	private String pancard;
	private long aadharcard;
	private long contact;
	private String mailId;
	private double accountBalnce;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public long getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(long aadharcard) {
		this.aadharcard = aadharcard;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public double getAccountBalnce() {
		return accountBalnce;
	}
	public void setAccountBalnce(double accountBalnce) {
		this.accountBalnce = accountBalnce;
	}
	
	public String toString() {
		return "Account [accountNumber=" + accountNo + ", accountName =" + accountName + ", Pancard=" + pancard +",aadharCard No =" + aadharcard + ",Contact ="+ contact + ", mailId =" + mailId +", Account Balance = " + accountBalnce + "]";
		
	}
	
	
	
	

}
