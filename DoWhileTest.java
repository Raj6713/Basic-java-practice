/*This program will check working of the Do while loop*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class DoWhileTest 
{
	public static void main(String[] args) throws IOException
	{
		String input;
		DoWhile dw=new DoWhile();
		input=JOptionPane.showInputDialog("Enter(start,end):");
		dw.setStart(Integer.parseInt(input.split(" ")[0]));
		dw.setEnd(Integer.parseInt(input.split(" ")[1]));
		dw.displayMessage();
	}
}n