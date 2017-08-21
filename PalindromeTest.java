/*Write a program which will check working of the Palindrome class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class PalindromeTest 
{
	public static void main(String[] args) throws IOException 
	{
		Palindrome p1=new Palindrome();
		String input;
		input=JOptionPane.showInputDialog("Enter five digit number");
		p1.setNumber(Integer.parseInt(input));
		p1.displayMessage();
	}
}