/*This class will show output of the tempreature class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class TempreatureTest 
{
	public static void main(String[] args) throws IOException 
	{
		Tempreature t=new Tempreature();
		String input;
		input=JOptionPane.showInputDialog("Enter Tempreature:");
		t.setTemp(Double.parseDouble(input));
		t.displayMessage();
	}
}