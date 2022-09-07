package bai8;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;
	
	public Account() {
		accountNumber =999999;
		name = " chua xac dinh";
		balance = 50000;
		
	}
	public Account(long accountNumber, String name) {
		if(accountNumber <= 0) {
			this.accountNumber = 999999;
		}else {
			this.accountNumber = accountNumber;
		}
		if(name.equals("")) {
			this.name="chua xac dinh";
		}else {		
			this.name = name;
		}
		balance = 50000;
	}
	
	public Account(  String Name,long accountNumber, double balance) {
		if(accountNumber <= 0) {
			this.accountNumber = 999999;
		}else {
			this.accountNumber = accountNumber;
		}
		
		if(Name.equals("")) {
			this.name ="chua xac dinh";
		}else {		
			this.name = Name;
		}
		
		if(balance <= 50000) {
			this.balance = balance;
		}else {
			this.balance = balance;
		}
		
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getRATE() {
		return RATE;
	}
	
	public boolean deposit(double amount) {
		if ( amount  > 0) {
			balance += amount;
			return true;
		}else {
			return false;
		}
		
	}
	public boolean withdraw(double amount , double fee) {
		if( amount >0  && amount + fee <= balance) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void addInterest(Account acc) {
		acc.balance = acc.getBalance() + acc.getBalance() * RATE;
		
	}
	
	public boolean napTien (Account acc, double amount) {
		if(amount >0 && balance >= amount) {
//			this.balance -= amount;
//			acc.balance += amount;
		acc.setBalance(acc.getBalance() + amount );
			System.out.println(" nap tien thanh cong");
			return true;
		}else {
			System.out.println("Nap tien khong thanh cong");
			return false;
		}
//		return false;
		
	}
	
	public boolean rutTien (Account acc , double amount) {
		double phi = 2000;
		if (  amount > 0 && balance >= amount) {
			acc.setBalance(acc.getBalance() - amount - phi );
			System.out.println("rut tien thanh cong");
			return true;
		}else {
			System.out.println(" Rut tien khong thanh cong");
			return false;
		}
	}
	
	//ham chuyen tien
	public boolean transfer (Account acc1, Account acc2, double amount) {
		if(acc2.getBalance() > amount && amount > 0) {
			acc2.setBalance(acc2.getBalance() - amount);
			acc1.setBalance(acc1.getBalance()+ amount);
			System.out.println(" chuyen khoan thanh cong");
			return true;
		}else {
			System.out.println("Chuyen khoan khong thanh cong");
			return false;
		}
			
		
	}
	
	@Override
	public String toString() {
		Locale local = new Locale("vi","vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		return "Account [ accountNumber = " + accountNumber + ", name=" + name + ", balance=" +formatter.format(balance) + ", RATE" + RATE;
		
		
	}
	
}
