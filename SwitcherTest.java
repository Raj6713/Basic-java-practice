/*This class will check working of the Switcher method in class*/
import javax.swing.JOptionPane;
import java.io.IOException;

public class SwitcherTest 
{
	public static void main(String[] args) throws IOException
	{
		String input;
		Switcher s1=new Switcher();
		input=JOptionPane.showInputDialog("Enter class Size:");
        s1.setSize(Integer.parseInt(input));
        s1.displayMessage();
	}
}