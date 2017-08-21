/*Write a program which will show the working of the minimum and will 
use java internal library*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Minimum 
{
	private String message;
    private double num1,num2,num3,mini;
    public Minimum()
    {
    	num1=num2=num3=0.0;
    }

    public void setNum1(double n){num1=n;}
    public void setNum2(double n){num2=n;}
    public void setNum3(double n){num3=n;}
    
    private double getNum1(){return num1;}
    private double getNum2(){return num2;}
    private double getNum3(){return num3;}

    private void finMin()
    {
    	mini=Math.min(getNum1(),Math.min(getNum2(),getNum3()));
    }

    public void displayMessage()
    {
    	finMin();
    	message="Three numbers:"+Double.toString(getNum1())+
    	         Double.toString(getNum2())+Double.toString(getNum3())+
    	         "\nMinimum is: "+Double.toString(mini);
    	JOptionPane.showMessageDialog(null,message);
    }
}