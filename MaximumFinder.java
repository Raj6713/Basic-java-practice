/*Write a class which will program to find the maximu among three numbers*/
import javax.swing.JOptionPane;
public class MaximumFinder
{
	private String message;
	private int num1,num2,num3;
	public MaximumFinder(){}
	public void setNum1(int n1){num1=n1;}
	public void setNum2(int n1){num2=n1;}
	public void setNum3(int n1){num3=n1;}

	private int getNum1(){return num1;}
	private int getNum2(){return num2;}
	private int getNum3(){return num3;}

	private void calculation()
	{
		message="Maximum among:"+Integer.toString(num1)+
		         Integer.toString(num2)+Integer.toString(num3)+"\n";
		int maximum=num1;
		if(num2>maximum)
		maximum=num2;
		if(num3>maximum)
		maximum=num3;

		message+="Maximum is given by:"+Integer.toString(maximum)+"\n";         
	}

	public void displayMessage()
	{
		calculation();
		JOptionPane.showMessageDialog(null,message);
	}


}