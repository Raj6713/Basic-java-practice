/*This class will test AirLine class and will show output on screen*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class AirLineTest 
{
	public static void main(String[] args) throws IOException 
	{
		AirLine passengerBook=new AirLine();
		String input;
		input=JOptionPane.showInputDialog("Enter Name: ");
		passengerBook.setPassengerName(input);
		input="Enter\n1>First Class\n2>Economy.";
		input=JOptionPane.showInputDialog(input);
		switch(Integer.parseInt(input))
		{
			case 1:
			passengerBook.firstClass();
			break;
			case 2:
			passengerBook.economy();
			break;
			default:
			JOptionPane.showMessageDialog("You entered Wrong choice");
		}
		passengerBook.displayMessage();

	}
}