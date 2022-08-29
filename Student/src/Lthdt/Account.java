package Lthdt;

public class Account {
	private long accNumber;
	private String name;
	private double balance;
	private double RATE = 0.035;
	
	public Account() {
		accNumber =999999;
		name =" chua xac dinh";
		balance = 50000;
	}
	
	public Account(long accNumber, String name, double balance ) {
		this.accNumber = accNumber;
		this.name =name;
		this.balance = balance;
		
	}
	
	public Account(long accNumber,String name) {
		this.accNumber = accNumber;
		this.name = name;
	}
	
	public long getAccountNumber() {
		return accNumber;
	}
	
	public 	double getBalance() {
		return balance;
	}
	
//	public boolean deposit(double amount) {
//		if(amount == true) {
//			return amount >0;
//			
//		}
//	}
}
