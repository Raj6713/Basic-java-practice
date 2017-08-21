/*This class will check workin of the java class and show output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class RandomNTest
{
	public static void main(String[] args) throws IOException
	{
		RandomN rn=new RandomN();
		String inp;
		inp=JOptionPane.showInputDialog("Enter(faces,rolls)");
		rn.setDiceFace(Integer.parseInt(inp.split(" ")[0]));
		rn.setRolls(Integer.parseInt(inp.split(" ")[1]));
		rn.displayMessage();
	}
}