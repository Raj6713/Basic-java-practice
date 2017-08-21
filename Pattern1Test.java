/*This class will set and get results for Pattern class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class Pattern1Test 
{
	public static void main(String[] args) throws IOException
	{
		Pattern1 p=new Pattern1();
		String inp;
		inp=JOptionPane.showInputDialog("Enter size: ");
		p.setSize(Integer.parseInt(inp));
		p.displayMessage();
	}

}