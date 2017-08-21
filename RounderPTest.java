/*This class will check working of the Rounder P class and show
output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class RounderPTest
{
	public static void main(String[] args) throws IOException 
	{
		RounderP rp=new RounderP();
		String inp;
		inp=JOptionPane.showInputDialog("Enter Double number: ");
		rp.setNum(Double.parseDouble(inp));
		rp.displayMessage();
	}

}