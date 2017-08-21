
/*Write a program which will show the working of the Driver class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class DriverTest
{
	public static void main(String[] args) throws IOException 
	{
		Driver d1=new Driver("Mr. teacher");
		d1.displayMessage();
		String input;
		input=JOptionPane.showInputDialog("Enter Instructor Name: ");
		d1.setInstructor(input);
		d1.calculatePass();
		d1.displayMessage();
		JOptionPane.showMessageDialog(null,"End of program.");
	}
}