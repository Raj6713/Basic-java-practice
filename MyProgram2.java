/*Write a program which will show the output of comparison*/
import javax.swing.JOptionPane;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class MyProgram2 
{
	public static void main(String[] args) throws IOException 
	{
	 BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
     String nu1=JOptionPane.showInputDialog("Enter First number: ");
     String nu2=JOptionPane.showInputDialog("Enter second number: ");	 
	 int num1=Integer.parseInt(nu1);
	 int num2=Integer.parseInt(nu2);
     String message="";
     if(num1>num2)
     	message+=Integer.toString(num1)+" > "+Integer.toString(num2)+"\n";
      if(num1<num2)
     	message+=Integer.toString(num1)+" < "+Integer.toString(num2)+"\n";
      if(num1>=num2)
     	message+=Integer.toString(num1)+" >= "+Integer.toString(num2)+"\n";
      if(num1<=num2)
     	message+=Integer.toString(num1)+" <= "+Integer.toString(num2)+"\n";
      if(num1!=num2)
     	message+=Integer.toString(num1)+" != "+Integer.toString(num2)+"\n";
      if(num1==num2)
     	message+=Integer.toString(num1)+" == "+Integer.toString(num2)+"\n";
     JOptionPane.showMessageDialog(null,message);
	}
}
