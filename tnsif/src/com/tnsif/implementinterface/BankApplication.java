package com.tnsif.implementinterface;

public class BankApplication {

	public static void main(String[] args) {
		
      Bank bank = new BankImp();
      Account account = new Account(467445456,"abc",8686.0,bank);
      account.deposit(2000);
      System.out.println(account);
      
      account.withdraw(5000);
      System.out.println(account);
	}

}
