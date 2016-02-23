package com.techarrows.spring.pojo;
import java.util.Scanner;

import javax.naming.OperationNotSupportedException;

import com.training.bank_accout.WithdrawllimitExceededException;

public abstract class BankAccount {
	public String accountholdername;
	public String accountnumber;
	public static  double withdrawllimit = 1000;
	public static double getWithdrawllimit() {
		return withdrawllimit;
	}

	public static void setWithdrawllimit(double withdrawllimit) {
		BankAccount.withdrawllimit = withdrawllimit;
	}
	protected double balance = 5000;
	protected double depositamount;
	protected  double checkamount;
	protected double withdrawlamount;
	
	
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositamount() {
		return depositamount;
	}

	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}

	public double getCheckamount() {
		return checkamount;
	}

	public void setCheckamount(double checkamount) {
		this.checkamount = checkamount;
	}

	public double getWithdrawlamount() {
		return withdrawlamount;
	}

	public void setWithdrawlamount(double withdrawlamount) {
		this.withdrawlamount = withdrawlamount;
	}

	public static void main(String[] args) throws CheckBouncedException, OperationNotSupportedException, perDayLimitExceededException, WithdrawllimitExceededException, InsufficientFundsException {
		// TODO Auto-generated method stub
		BankAccount checkingsacc = new CheckingsAccount();
		BankAccount savingsacc = new SavingsAccount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Deposit Amount:");
		checkingsacc.depositamount=Double.parseDouble(scanner.next());
		checkingsacc.deposit(checkingsacc.depositamount);
		savingsacc.deposit(savingsacc.depositamount);
		savingsacc.depositamount=Double.parseDouble(scanner.next());
		System.out.println("Enter withdrawl amount");
		checkingsacc.withdrawlamount = Double.parseDouble(scanner.next());
		checkingsacc.withDraw(checkingsacc.withdrawlamount);
		savingsacc.withdrawlamount = Double.parseDouble(scanner.next());
		savingsacc.withDraw(savingsacc.withdrawlamount);
		System.out.println("Enter Checkamount");
		checkingsacc.checkamount = Double.parseDouble(scanner.next());
		checkingsacc.processCheck(checkingsacc.checkamount);
		savingsacc.checkamount = Double.parseDouble(scanner.next());
		savingsacc.processCheck(savingsacc.checkamount);
	}
	
	public abstract double deposit(double depositamount);
	public  abstract double withDraw(double withdrawlamount) throws WithdrawllimitExceededException, InsufficientFundsException, perDayLimitExceededException;
	public abstract double processCheck(double checkamount) throws OperationNotSupportedException, CheckBouncedException;

	
	
	}
