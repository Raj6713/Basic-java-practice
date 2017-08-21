/*Write a program which will take a number and will reverse and print it*/
import javax.swing.JOptionPane;
public class Reverse 
{
	private String message;
	private int num;
	public Reverse()
	{
		num=0;
	}
	public void setNum(int n){num=n;}
	private int getNum(){return num;}

	private void reverser()
	{
		message="Input number: "+Integer.toString(getNum())+
		        "\nReverse number: ";
		
		int p=getNum();
		while(p>0)
		{
			message+=Integer.toString(p%10);
			p=p/10;
		}
	}

	public void displayMessage()
	{
		reverser();
		JOptionPane.showMessageDialog(null,message);
	}


}