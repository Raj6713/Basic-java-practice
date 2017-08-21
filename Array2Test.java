/*Write a program which will set and get values for array class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class Array2Test 
{
	public static void main(String[] args) throws IOException 
	{
		Array2 arp=new Array2();
		String inp;
		inp=JOptionPane.showInputDialog("Enter Size: ");
		arp.setSize(Integer.parseInt(inp));
		arp.displayMessage();
	}
}