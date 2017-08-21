/*Class to check working of the Salesperson*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class SalespersonTest 
{
	public static void main(String[] args) throws IOException 
	{
		Salesperson person1=new Salesperson();
		String input;
		person1.displayMessage();
		input=JOptionPane.showInputDialog("Enter name: ");
		person1.setName(input);
		input=JOptionPane.showInputDialog("Enter items: ");
		person1.setTotalCount(Integer.parseInt(input));
		person1.calculate();
		person1.displayMessage();
	}
}