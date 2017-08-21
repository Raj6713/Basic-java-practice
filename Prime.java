/*Write a program which will check whatever a number is prime or not*/
import javax.swing.JOptionPane;
public class Prime 
{
	private String message;
	private int num;
	Prime()
	{
		message="";
		num=0;
	}
	public void setPrime(int n){num=n;}
	private int getPrime(){return num;}

	private void primeChecker()
	{
		message="Given number: "+Integer.toString(num)+"\n";
         boolean flag=true;
		for(int i=2;i<(int)(getPrime()/2+1);i++)
		{
			if(num%i==0)
				{flag=false;break;}
		}
		if(flag)
			message+="is Prime.";
		else 
			message+="is not a prime.";
	}

    public void displayMessage()
    {
    	primeChecker();
    	JOptionPane.showMessageDialog(null,message);
    }
}