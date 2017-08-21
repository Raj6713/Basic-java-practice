
/*This program will check working of the Loop sum*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class LoopSumTest
{
	public static void main(String[] args) throws IOException 
	{
		LoopSum sum=new LoopSum();
		String input;
		input=JOptionPane.showInputDialog("Enter(start,end):");
		sum.setStart(Integer.parseInt(input.split(" ")[0]));
		sum.setEnd(Integer.parseInt(input.split(" ")[1]));
		sum.displayMessage();
	}
}