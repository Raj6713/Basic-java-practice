/*This class will check working of the Parking charge class:*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ParkingChargeTest 
{
	public static void main(String[] args) throws IOException
	{
		ParkingCharge pc=new ParkingCharge();
		String inp;
		inp=JOptionPane.showInputDialog("Enter hours: ");
		pc.setHours(Double.parseDouble(inp));
		pc.displayMessage();
	}
}