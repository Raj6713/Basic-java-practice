/*will set and get results for java class ArraySum*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ArraySumTest 
{
	public static void main(String[] args) throws IOException 
	{
		ArraySum as=new ArraySum();
		String inp;
		inp=JOptionPane.showInputDialog("Enter size: ");
		as.setSize(Integer.parseInt(inp));
		as.displayMessage();
	}
}