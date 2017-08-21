/*This program will show the Working of Bankinga app and its output*/
public class MyApp 
{
	private double balance;
	public MyApp(double bal)
	{
		if(bal>0.0)
			balance=bal;
		else
			balance=0.0;
	}

	public double getBalance(double bal)
	{
       return balance;
	}
	public void credit(double cre)
	{
		if(cre>0.0)
		balance=balance+cre;
	}
	public void debit(double deb)
	{
		if(deb>0.0)
		{
			if(balance>deb)
				balance=balance-deb;
		}
	}

	public String messagePass()
	{
		String message;
		message="Balance is "+Double.toString(balance);
		return message;
	}

}