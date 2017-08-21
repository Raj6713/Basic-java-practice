/*This class will show working of the Continue class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ContinueTest 
{
	public static void main(String[] args) throws IOException
	{
		Continue cn=new Continue();
		String inp;
		inp=JOptionPane.showInputDialog("Enter (start,end): ");
		cn.setStart(Integer.parseInt(inp.split(" ")[0]));
		cn.setEnd(Integer.parseInt(inp.split(" ")[1]));
		cn.displayMessage();
	}
}