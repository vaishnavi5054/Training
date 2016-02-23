package com.techarrows.spring.launcher;

import javax.naming.OperationNotSupportedException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techarrows.spring.pojo.AccountType;
import com.techarrows.spring.pojo.BankAccount;
import com.techarrows.spring.pojo.CheckBouncedException;
import com.techarrows.spring.pojo.Drawing;
import com.techarrows.spring.pojo.InsufficientFundsException;
import com.techarrows.spring.pojo.perDayLimitExceededException;
import com.training.bank_accout.WithdrawllimitExceededException;

public class BankAccountLauncher {
	public static void main(String[] args) throws WithdrawllimitExceededException, InsufficientFundsException, perDayLimitExceededException, OperationNotSupportedException, CheckBouncedException{
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ta/spring/trainingContext.xml");
		AccountType accounttype= (AccountType)applicationContext.getBean("SavingsAccountBankAccount");
	        accounttype.deposit(3000);
	        accounttype.withDraw(2000);
	      //  accounttype.processCheck(1000);
	        
	         accounttype = (AccountType)applicationContext.getBean("CheckingsAccountBankAccount");
	         accounttype.deposit(1000);
		     accounttype.withDraw(1000);
		     accounttype.processCheck(500);
	}
}