package com.techarrows.spring.pojo;

import javax.naming.OperationNotSupportedException;

import com.training.bank_accout.WithdrawllimitExceededException;

public class SavingsAccount extends BankAccount{
	//BankAccount bankaccount = new SavingsAccount();
	@Override
	public double deposit(double depositamount) {
		// TODO Auto-generated method stub
		//double depositamount =500;
		balance = balance + depositamount;
		System.out.println("Balance is: " +balance);
		return balance;
	}
	@Override
	public double withDraw(double balance)
			throws WithdrawllimitExceededException, InsufficientFundsException, perDayLimitExceededException {
		// TODO Auto-generated method stub
		//try {
			if (withdrawlamount > balance) {
				throw new InsufficientFundsException();
				//System.out.println("Exception: Insufficient funds");
			}
			else
		    {
			
			balance = balance - withdrawlamount;
		    }
		//}
		return balance;

	}
	
	@Override
	public double processCheck(double checkamount) throws OperationNotSupportedException {
		//return balance;
		throw new OperationNotSupportedException();
		
	}
	
	
	
}
