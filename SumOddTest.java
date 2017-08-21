/*Write a program which will show working of the odd numbers*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class SumOddTest 
{
	public static void main(String[] args) throws IOException 
	{
		SumOdd odd=new SumOdd();
		String inp;
		inp=JOptionPane.showInputDialog("Enter value:(start,end) ");
		odd.setStart(Integer.parseInt(inp.split(" ")[0]));
		odd.setEnd(Integer.parseInt(inp.split(" ")[1]));
		odd.displayMessage();
	}
}