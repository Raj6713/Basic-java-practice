/*Write a program which will show the working of the Account*/
public class Account 
{
	private double balance;
	public Account(double value)
	{
		if(value>0.0)
			balance=value;
		else 
			balance=0.0;
	}
	public void setBalance(double value)
	{
		if(value>0.0)
			balance=value;
	}

	public double getBalance()
	{
		return balance;
	}

	public void credit(double amount)
	{
		balance=balance+amount;
	}

	public void debit(double amount)
	{
		if(amount>0.0)
		{
		if(balance>amount)
			balance=balance-amount;
	    }
    }

	public void displayMessage()
	{
		System.out.printf("Current Balance is: %.2f\n",balance);
	}
}