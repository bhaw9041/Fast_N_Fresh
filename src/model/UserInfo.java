package model;

public class UserInfo {
	private String username;
	private String address;
	private String mailId;
	private int contactNo;
	private int wallet_balance;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getWallet_balance() {
		return wallet_balance;
	}
	public void setWallet_balance(int wallet_balance) {
		this.wallet_balance = wallet_balance;
		
	}
}
