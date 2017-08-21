/*Write a program which will show the working of the two dimensional
class and show output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class TwoDim1Test 
{
	public static void main(String[] args) throws IOException
	{
		TwoDim1 td1=new TwoDim1();
		String inp;
		inp=JOptionPane.showInputDialog("Enter row:");
		td1.setRow(Integer.parseInt(inp));
		inp=JOptionPane.showInputDialog("Enter column array:");
		td1.setCol(inp);
		td1.setArray();
		td1.displayMessage();
	}
}