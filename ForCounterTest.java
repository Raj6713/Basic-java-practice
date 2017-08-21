/*This class will check working of the for counter loop and display result*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ForCounterTest 
{
	public static void main(String[] args) throws IOException 
	{
		ForCounter counter=new ForCounter();
		String input;
		input=JOptionPane.showInputDialog("Enter (start,end):");
		counter.setStart(Integer.parseInt(input.split(" ")[0]));
		counter.setEnd(Integer.parseInt(input.split(" ")[1]));
		counter.displayMessage();
	}
}