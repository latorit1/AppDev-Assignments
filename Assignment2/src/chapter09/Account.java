package chapter09;

import java.util.Date;

//Ch09_07 class
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	public Account() {
		
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		
	}
	
	public Account(int id, double balance) {
		
		this.id = id;
		this.balance = balance;
		
	}
	
	// Accessor Methods
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double annualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		dateCreated = new java.util.Date();
		return dateCreated;
	}
	
	//Mutator Methods
	
	public void setId(int id) {
		this.id = id;
		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	public void setRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate/100) / 12;
		
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
		
	}
	
	public void withdraw(double amount) {
		
		this.balance -= amount;
		
	}
	
	public void deposit(double amount) {
		
		this.balance += amount;
	}
}
