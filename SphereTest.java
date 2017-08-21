import javax.swing.JOptionPane;
import java.io.IOException;
public class SphereTest 
{
	public static void main(String[] args) throws IOException 
	{
		Sphere sp=new Sphere();
		String inp;
		inp=JOptionPane.showInputDialog("Enter radius: ");
		sp.setRadius(Double.parseDouble(inp));
		sp.volumeCal();
		sp.displayMessage();
	}
}