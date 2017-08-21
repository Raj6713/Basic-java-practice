/*This class will check working of the maximum finder class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class MaximumFinderTest 
{
	public static void main(String[] args) throws IOException 
	{
		MaximumFinder mf=new MaximumFinder();
		String inp;
		inp=JOptionPane.showInputDialog("Enter number(n1,n2,n3):");
		mf.setNum1(Integer.parseInt(inp.split(" ")[0]));
		mf.setNum2(Integer.parseInt(inp.split(" ")[2]));
		mf.setNum3(Integer.parseInt(inp.split(" ")[2]));
		mf.displayMessage();
	}
}