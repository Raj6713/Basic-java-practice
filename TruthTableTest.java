/*This class will show working of the TruthTable */
import javax.swing.JOptionPane;
import java.io.IOException;
public class TruthTableTest 
{
	public static void main(String[] args) throws IOException
	{
		TruthTable t1=new TruthTable();
		String inp;
		inp=JOptionPane.showInputDialog("Enter (true,false)");
		t1.setInt1(inp.split(" ")[0]);
		t1.setInt2(inp.split(" ")[1]);
		t1.displayMessage();
	}
}