/*Write a program which will show working of the breakTest class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class BreakTest 
{
	public static void main(String[] args) throws IOException 
	{
		Break be=new Break();
		String inp;
		inp=JOptionPane.showInputDialog("Enter (start,end): ");
		be.setStart(Integer.parseInt(inp.split(" ")[0]));
	    be.setEnd(Integer.parseInt(inp.split(" ")[1]));
	    be.displayMessage();
	}
}