package com.techarrows.spring.pojo;

public class CheckingsAccount extends BankAccount {
	//BankAccount bankaccount = new CheckingsAccount();

	@Override
	public double withDraw(double withdrawlamount) throws perDayLimitExceededException {
		// TODO Auto-generated method stub
	
			//double withdrawlamount = 5000;
			// throw MyException(Bank_Account.balance < Bank_Account.limitamount);
			

				if (BankAccount.withdrawllimit < withdrawlamount) {
					throw new perDayLimitExceededException();
					//System.out.println("Exception: Insufficient funds");
				}

		
			// catch(InsufficientFundsException e){
			// System.out.println("Exception: "+e);
			// }

			else{

				balance = balance - withdrawlamount;
				System.out.println("" + balance);

			}
			
			return balance;
		}

		public double processCheck(double checkamount) throws CheckBouncedException {
			// TODO Auto-generated method stub
			//double checkamount = 500;
			
				if (checkamount > balance) {
					throw new CheckBouncedException();
				}
			 else {
				balance = balance - checkamount;
				System.out.println("" + balance);
			}
			
			return balance;

		}
		public double deposit(double depositamount) {
			// TODO Auto-generated method stub
			
			balance = balance + depositamount;
			System.out.println("Balance is: " +balance);
			return balance;
			
			
		}

	}
