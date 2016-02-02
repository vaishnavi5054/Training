package com.training.bank_accout;

public abstract class Bank_Account {

	public static double balance = 500;
	public static double limitamount = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking_Account checkaccount = new Checking_Account();
		Savings_Account savingsaccount = new Savings_Account();
		checkaccount.process_Check();
		checkaccount.deposit();
		savingsaccount.deposit();
		savingsaccount.calculateInterest();
	}		
	public abstract void withDrawl();
	//public abstract void process_Check();
		
	}
	

