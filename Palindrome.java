/*Write a program which will show calculate on basis of Palindrome*/
import javax.swing.JOptionPane;
public class Palindrome 
{
	private String message;
	private int num;
	public Palindrome(){num=0;}

	public void setNumber(int n){num=n; palindrome();}
	public int  getNumber(){return num;}

	private void palindrome()
	{
		message="Number: "+Integer.toString(num);
		int n1,n2,n3,n4,n5,copyNum;
		copyNum=num;
		n5=copyNum%10;
		copyNum=copyNum/10;
		n4=copyNum%10;
		copyNum=copyNum/10;
		n3=copyNum%10;
		copyNum=copyNum/10;
		n2=copyNum%10;
		copyNum=copyNum/10;
		n1=copyNum;
		if((n1==n5) &&(n2==n4))
			message+="\nis Palindrome";
		else
			message+="\n is Not a Palindrome";


	}

	public void displayMessage()
	{
		JOptionPane.showMessageDialog(null,message);
	}

}