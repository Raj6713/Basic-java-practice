/*Write a program which will show and work on Reverse class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ReverseTest 
{
	public static void main(String[] args) throws IOException
	{
		Reverse r=new Reverse();
		String inp;
		inp=JOptionPane.showInputDialog("Enter a number:");
		r.setNum(Integer.parseInt(inp));
		r.displayMessage();
	}
}