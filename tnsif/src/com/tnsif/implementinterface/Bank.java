package com.tnsif.implementinterface;

public interface Bank {
   double MIN_BALANCE = 500;
   double DEPOSIT_LIMIT = 50000;
   double INTEREST_RATE = 7.8;
   
   void deposit(Account account,double amount);
   void withdraw(Account account, double amount);
}
   