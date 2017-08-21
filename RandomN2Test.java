/*This program will check working of the given class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class RandomN2Test 
{
	public static void main(String[] args) throws IOException
	{
		RandomN2 newDice=new RandomN2();
		String inp;
		inp=JOptionPane.showInputDialog("Enter no. of rolls: ");
		newDice.setRoll(Integer.parseInt(inp));
		newDice.displayMessage();
	}
}