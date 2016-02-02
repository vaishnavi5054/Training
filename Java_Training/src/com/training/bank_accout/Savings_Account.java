package com.training.bank_accout;

public class Savings_Account extends Bank_Account {

	@Override
	public void withDrawl() {
		// TODO Auto-generated method stub
		double withdrawlamount = 5000;
		if(withdrawlamount > Bank_Account.limitamount){
			System.out.println("MAX Limit exceeded");
		}
		else{
			balance = balance - withdrawlamount;
			System.out.println("" +balance);
		}

	}
	public void deposit() {
		int depositamount = 100;
		balance = balance + depositamount;
		System.out.println("from savings account: " +balance);

	}

	protected void calculateInterest()
	{
		double interest_rate = 1;
		float time = 6;
		double principal_amount = 500;
		double interest_amount = (principal_amount * time * interest_rate) / 100;
		balance = balance + interest_amount;
	}

}
