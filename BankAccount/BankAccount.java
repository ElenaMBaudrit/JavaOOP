package com.codingdojo.bankaccount;

import java.util.*;

public class BankAccount {
	private String accountNum;
	private Double checkingBalance;
	private Double savingsBalance;
	
	private static Integer numberOfAccounts = 0;
	private static Double moneyStored = (double) 0;
    
    public BankAccount() { //Account counter
    	accountNum= setAccountNum();
    	numberOfAccounts++;
    	checkingBalance = 0.0;
    	savingsBalance = 0.0;
    }
    
	private String setAccountNum() {
		Random rnd = new Random();
        int number = rnd.nextInt(9000000) + 1000000000;
        String result = String.valueOf(number);
        System.out.println(result);
        return result;
	}
//	 Create a getter method for the user's checking account balance.
	public Double getCheckingBalance() {
		return checkingBalance;
	}
//	Create a getter method for the user's saving account balance.
	public Double getSavingsBalance() {
		return savingsBalance;
	}

//	Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.	
	public void addCheckMoney(Double moneyAmount) {
		checkingBalance += moneyAmount;
		moneyStored+=moneyAmount;
//		System.out.println("You have deposited "+ deposit.getCheckingBalance());
}
	
	public void addSavingsMoney(Double moneyAmount ) {
		savingsBalance += moneyAmount ;
		moneyStored+=moneyAmount ;
//		System.out.println("You have deposited "+ deposit.getSavingsBalance());
}
//	Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	public void withdrawMoney(String account, Double moneyAmount) {
		if (account == "savings"){
			this.savingsBalance -= moneyAmount;
		}
		else {
			this.checkingBalance -= moneyAmount;
		}
		moneyStored-=moneyAmount;
	}
	public String totalAmount(){
		String Result = "You have "+checkingBalance+"in your Checkings Account and "+savingsBalance+ " in the Savings Account.";
		return Result;
}

}
