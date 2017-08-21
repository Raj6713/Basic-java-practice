
/*This program will check the working of the credit class and
show its working on the screen*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class CreditTest 
{
	public static void main(String[] args) throws IOException 
	{
		Credit cr=new Credit();
		String input;
		cr.displayMessage();
		input=JOptionPane.showInputDialog("Name: ");
		cr.setName(input);
		input=JOptionPane.showInputDialog("Account number: ");
		cr.setAccNo(input);
		input=JOptionPane.showInputDialog("Opening Balance: ");
		cr.setOpeningBalance(Double.parseDouble(input));
		input=JOptionPane.showInputDialog("Credit Limit: ");
		cr.setCreditLimit(Double.parseDouble(input));
		input=JOptionPane.showInputDialog(" Credit Applied: ");
		cr.setCreditApplied(Double.parseDouble(input));
		input=JOptionPane.showInputDialog("Total Item charged: ");
		cr.setTotalItemCharged(Double.parseDouble(input));
		cr.calculation();
		cr.displayMessage();
	}
}