/*This program will check working of the java class Duplicate*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class DuplicateTest 
{
	public static void main(String[] args) throws IOException 
	{
		Duplicate dp=new Duplicate();
		String input;
		input=JOptionPane.showInputDialog("Enter Size: ");
		dp.setSize(Integer.parseInt(input));
		dp.setArrayElement();
		dp.displayMessage();
	}
}