/*This program will check workng of the factorial method*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class FactorialTest 
{
	public static void main(String[] args) throws IOException 
	{
		String input;
		Factorial fac=new Factorial();
		input=JOptionPane.showInputDialog("Enter num: ");
		fac.setNum(Integer.parseInt(input));
		fac.displayMessage();
	}
}