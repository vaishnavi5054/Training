package com.techarrows.spring.pojo;

import javax.naming.OperationNotSupportedException;

import com.training.bank_accout.WithdrawllimitExceededException;

public class AccountType {

	private BankAccount bankaccount;
	public void AccountType() throws WithdrawllimitExceededException, InsufficientFundsException, perDayLimitExceededException, OperationNotSupportedException, CheckBouncedException {
		// TODO Auto-generated constructor stub
		bankaccount.deposit(1000);
		bankaccount.withDraw(1000);
		//bankaccount.processCheck(1000);
	}
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}
	
	public void deposit(double amount){
		bankaccount.deposit(amount);
	}
	public void withDraw(double withdrawamnt) throws WithdrawllimitExceededException, InsufficientFundsException, perDayLimitExceededException{
		bankaccount.withDraw(withdrawamnt);
	}
	public void processCheck(double check) throws OperationNotSupportedException, CheckBouncedException{
		bankaccount.processCheck(check);
	}
	 
	

}
