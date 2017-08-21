/*This program will find the maximum using mathematics internal library*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class MaximumF1 
{
	private String message;
	private int num1,num2,num3,max;
	public MaximumF1()
	{
		num1=num2=num3=max=0;
	}
	public void setNum1(int n){num1=n;}
	public void setNum2(int n){num2=n;}
	public void setNum3(int n){num3=n;}

	private int getNum1(){return num1;}
	private int getNum2(){return num2;}
	private int getNum3(){return num3;}

	private void calculation()
	{
		message="Maximum among: "+Integer.toString(getNum1())+" "+
		        Integer.toString(getNum2())+" "+Integer.toString(getNum3());
		max=Math.max(num1,Math.max(num2,num3));
		message+="\nMaximum is"+Integer.toString(max);
	}

    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }

}