/*This program will show the working of the Mileage class 
and show corresponding output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class MileageTest 
{
	public static void main(String[] args) throws IOException 
	{
		Mileage m1=new Mileage();
		m1.displayMessage();
		m1.calculate();
		m1.displayMessage();

	}
}