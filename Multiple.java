/*Write a program which will show tha one number is multiple of other 
or not*/
import javax.swing.JOptionPane;
public class Multiple 
{
	private String message;
	private int num1,num2;
	public Multiple()
	{
		num1=num2=0;
	}
	public void setNum1(int n){num1=n;}
	public void setNum2(int n){num2=n;}

	private int getNum1(){return num1;}
	private int getNum2(){return num2;}

	private void calculate()
	{
		message="Number: "+Integer.toString(getNum1())+"\n"+
		        "Divisor: "+Integer.toString(getNum2());
		if(num1%num2==0)
			message+="\nTrue\n";
		else
			message+="\nFalse\n";
	}
      
     public void displayMessage()
     {
     	calculate();
     	JOptionPane.showMessageDialog(null,message);
     }

}