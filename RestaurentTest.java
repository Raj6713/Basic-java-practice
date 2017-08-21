/*This class will set and get results for Restaurent*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class RestaurentTest 
{
	public static void main(String[] args) throws IOException 
	{
		Restaurent r=new Restaurent();
		String inp;
		inp=JOptionPane.showInputDialog("Enter Size: ");
		r.setRatingSize(Integer.parseInt(inp));
		r.displayMessage();
	}
}