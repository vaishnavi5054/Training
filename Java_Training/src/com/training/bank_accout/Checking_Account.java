package com.training.bank_accout;

public class Checking_Account extends Bank_Account {
	//Bank_Account bankaccount = new Bank_Account(); 
	@Override
	public void withDrawl() {
		// TODO Auto-generated method stub
		double withdrawlamount = 50;
		if(Bank_Account.balance < Bank_Account.limitamount){
			System.out.println("No enough funds available");
		}
		else{
			balance = balance - withdrawlamount;
			System.out.println("" +balance);
		}
	}
	public void deposit() {
		int depositamount = 100;
		balance = balance + depositamount;
		System.out.println("from checkings account:" +balance);

	}

	protected void process_Check() {
		// TODO Auto-generated method stub
		double checkamount = 500;
		balance = balance + checkamount;
		System.out.println("" +balance);
		
	}


	

	
}
