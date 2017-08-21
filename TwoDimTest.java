/*This program will show the working of get and set of two dimensional
tests*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class TwoDimTest 
{
	public static void main(String[] args) throws IOException 
	{
		TwoDim td=new TwoDim();
		String input;
		input=JOptionPane.showInputDialog("Enter(row,col): ");
		td.setRow(Integer.parseInt(input.split(" ")[0]));
		td.setCol(Integer.parseInt(input.split(" ")[1]));
		td.setArray();
		td.displayMessage();
	}
}