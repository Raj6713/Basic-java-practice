import javax.swing.JOptionPane;
import java.io.IOException;
import javax.swing.JFrame;
public class GraphicsRectTest 
{
	public static void main(String[] args) throws IOException
	{
		GraphicsRect rp=new GraphicsRect();
		String inp;
		inp=JOptionPane.showInputDialog("Enter any number: ");
		rp.setChoice(Integer.parseInt(inp));
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(rp);
		application.setSize(500,500);
		application.setVisible(true);
	}
}