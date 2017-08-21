/*Write a program which will work on account*/
import javax.swing.JOptionPane;
public class Account1 
{
	private double balance;
	public Account1(double bal)
	{
		if(bal>=0.0)
			balance=bal;
		else
			balance=0.0;
	}

	public void setBalance(double amount)
	{
		if(amount>0.0)
			balance=amount;
		else
			balance=0.0;
	}

	public  getBalance()
	{
		return balance;
	}

	public void credit(double amount)
	{
		if(amount>0.0)
		{
			balance=balance+amount;
		}
	}
	public void debit(double amount)
	{
		if(amount>0.0)
		{
			if(balance>amount)
				balance=balance-amount;
		}
		else
		JOptionPane.showMessageDialog(null,"Balance Less than amount required");
	}

   public void displayMessage()
   {
   	String message;
   	message="Balance is: "+Double.toString(getBalance());
   	JOptionPane.showMessageDialog(null,message);
   }
}



















