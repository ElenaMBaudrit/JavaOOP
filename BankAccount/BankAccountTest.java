package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba = new BankAccount();
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		ba.addCheckMoney(100.00);
		ba.addSavingsMoney(200.00);
		ba.withdrawMoney("savings", 150.00);
		System.out.println(ba.getSavingsBalance());
		System.out.println(ba.getCheckingBalance());
		System.out.println(ba.totalAmount());
//	
		ba1.addSavingsMoney(150.00);
		ba1.addCheckMoney(150.00);
		ba1.withdrawMoney("savings", 350.00);
		System.out.println(ba1.getSavingsBalance());
		System.out.println(ba1.getCheckingBalance());
		System.out.println(ba1.totalAmount());
		
		ba2.addSavingsMoney(100.00);
		ba2.addCheckMoney(200.00);
		ba2.withdrawMoney("savings", 300.00);
		System.out.println(ba2.getSavingsBalance());
		System.out.println(ba2.getCheckingBalance());
		System.out.println(ba2.totalAmount());
	}

}
