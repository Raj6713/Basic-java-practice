/*Write a program which will round the number and show it on the screen.*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Rounder 
{
	private String message;
	private double num;
	public Rounder()
	{
		message="";
		num=0.0;
	}

	public void setNum(double p){num=p;}
	public double getNum(){return num;}

	private void rounding()
	{
		int k;
		k=(int)Math.floor(getNum()+0.5);
		message="Original Number: "+Double.toString(getNum())+"\n"+
		        "Rounded Number: "+Integer.toString(k);
	}
	public void displayMessage()
	{
		rounding();
		JOptionPane.showMessageDialog(null,message);
	}


}