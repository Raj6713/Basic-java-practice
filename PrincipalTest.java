/*This class will check working of the principal class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class PrincipalTest 
{
	public static void main(String[] args) throws IOException 
	{
		Principal p1=new Principal();
		String input;
		input=JOptionPane.showInputDialog("Enter (principal,rate,years)");
		p1.setPrin(Double.parseDouble(input.split(" ")[0]));
		p1.setIntRate(Double.parseDouble(input.split(" ")[1]));
		p1.setYears(Integer.parseInt(input.split(" ")[2]));
		p1.displayMessage();
	}
}