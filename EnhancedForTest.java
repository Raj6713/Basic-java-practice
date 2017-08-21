/*Write a program to set and get the program*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class EnhancedForTest 
{
	public static void main(String[] args) throws IOException 
	{
		EnhancedFor ef=new EnhancedFor();
		String inp;
		inp=JOptionPane.showInputDialog("Enter size:");
		ef.setSize(Integer.parseInt(inp));
		ef.displayMessage();
	}
}