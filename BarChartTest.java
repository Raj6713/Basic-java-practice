/*This class will set and get results for Barchart ad will display*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class BarChart
{
	public static void main(String[] args) throws IOException 
	{
		BarChart bc=new BarChart();
		String inp;
		inp=JOptionPane.showInputDialog("Enter size: ");
		bc.setSize(Integer.parseInt(inp));
		bc.displayMessage();
	}

}