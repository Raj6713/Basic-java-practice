
/*Write a program which will take input of two number add and show result*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
public class MyProgram 
{
	public static void main(String[] args) throws IOException 
	{
		String num1=JOptionPane.showInputDialog("Enter first Number:");
	    String num2=JOptionPane.showInputDialog("Enter Second Number:");
	   Double num3=Double.parseDouble(num1);
	   Double num4=Double.parseDouble(num2);
	    double sum=num3+num4;
	    String message=Double.toString(num3)+" + "+Double.toString(num4)+" = "+Double.toString(sum);
	    JOptionPane.showMessageDialog(null,message);



	}
}