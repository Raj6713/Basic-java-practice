import javax.swing.JOptionPane;
import java.io.IOException;
public class SumTest 
{
	public static void main(String[] args) throws IOException 
	{
		Sum s1=new Sum();
		String input;
		input=JOptionPane.showInputDialog("Enter lower limit:");
		s1.setLowerLimit(Integer.parseInt(input));
		input=JOptionPane.showInputDialog("Enter upper limit:");
		s1.setUpperLimit(Integer.parseInt(input));
		s1.calculate();
		s1.displayMessage();
	}
}