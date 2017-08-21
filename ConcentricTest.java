import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.IOException;
public class ConcentricTest
{
	public static void main(String[] args) throws IOException
	{
		Concentric circle=new Concentric();
		String inp;
		inp=JOptionPane.showInputDialog("Enter number of circle: ");
		circle.setCircles(Integer.parseInt(inp));
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(circle);
		application.setSize(400,400);
		application.setVisible(true);
	}
}