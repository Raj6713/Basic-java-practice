/*Write a program which will show the working of the rounder.*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class RounderTest 
{
	public static void main(String[] args) throws IOException 
	{
		Rounder r=new Rounder();
		String inp;
		inp=JOptionPane.showInputDialog("Enter a double type number:");
		r.setNum(Double.parseDouble(inp));
		r.displayMessage();
	}
}