import javax.swing.JOptionPane;
import java.io.IOException;
public class PerfectTest 
{
	public static void main(String[] args) throws IOException 
	{
		Perfect pf=new Perfect();
		String inp;
		inp=JOptionPane.showInputDialog("All perfect number from 1 to upper:");
		pf.setNum(Integer.parseInt(inp));
		pf.displayMessage();
	}
}