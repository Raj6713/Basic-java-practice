/*This class will set and get results from prime class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class PrimeTest 
{
	public static void main(String[] args) throws IOException 
	{
		Prime p=new Prime();
		String inp;
		inp=JOptionPane.showInputDialog("Enter a number: ");
		p.setPrime(Integer.parseInt(inp));
		p.displayMessage();
	}
}