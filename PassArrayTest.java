/*Write a program which will show the working of passArray*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class PassArrayTest 
{
	public static void main(String[] args) throws IOException 
	{
		PassArray pa=new PassArray();
		String inp;
		inp=JOptionPane.showInputDialog("Enter size of array: ");
		pa.setSize(Integer.parseInt(inp));
		pa.displayMessage();
	}
}