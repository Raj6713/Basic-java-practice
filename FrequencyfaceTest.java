/*This class will get and set values for frequency test and show 
result*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class FrequencyfaceTest 
{
	public static void main(String[] args) throws IOException 
	{
		FrequencyFace ff=new FrequencyFace();
		String input;
		input=JOptionPane.showInputDialog("Enter no. of rolls: ");
		ff.setRoll(Integer.parseInt(input));
		ff.displayMessage();
	}
}