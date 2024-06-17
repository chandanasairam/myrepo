package com.tnsif.implementinterface;

public class BankImp implements Bank {
	@Override
	public void deposit(Account account, double amount)
	{
		if(amount > DEPOSIT_LIMIT)
		{
			System.err.println("Deposit not possible........exceeds Deposit  Limit");
		}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("Deposited"+amount+" into account: "+account.getAccNo());
		}
	}
    @Override
    public void withdraw(Account account, double amount) {
    	if(account.getBalance() - amount>=MIN_BALANCE) {
    		account.setBalance(account.getBalance()-amount);
    		System.out.println("Withdrawn "+amount+" from account: "+account.getAccNo());
    }
}

}  
