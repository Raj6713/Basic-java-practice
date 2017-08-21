/*Program to test minimum*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class MinimumTest 
{
	public static void main(String[] args) throws IOException
	{
		Minimum mp=new Minimum();
		String inp;
		inp=JOptionPane.showInputDialog("Enter (n1,n2,n3): ");
		mp.setNum1(Double.parseDouble(inp.split(" ")[0]));
		mp.setNum2(Double.parseDouble(inp.split(" ")[1]));
		mp.setNum3(Double.parseDouble(inp.split(" ")[2]));
		mp.displayMessage();
	}
}