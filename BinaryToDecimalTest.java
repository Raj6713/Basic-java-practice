/*This class will work on the BinaryTo decimal converter and show it on
screen*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class BinaryToDecimalTest 
{
	public static void main(String[] args) throws IOException 
	{
		BinaryToDecimal bd=new BinaryToDecimal();
		String input;
		input=JOptionPane.showInputDialog("Enter binary Number: ");
        bd.setStr(input);
        bd.displayMessage();
	}
}