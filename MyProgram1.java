/*This program will take a number show the table of it*/
import javax.swing.JOptionPane;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class MyProgram1 
{
	public static void main(String[] args) throws IOException 
	{
		String nu=JOptionPane.showInputDialog("Input number:");
		int num=Integer.parseInt(nu);
		String message="";
		for(int i=1;i<=10;i++)
		{
			message+=Integer.toString(num)+" * "+Integer.toString(i)+" = "+Integer.toString(i*num)+"\n";			
		}
		JOptionPane.showMessageDialog(null,message);
	}
}