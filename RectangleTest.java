import javax.swing.JFrame;
import java.io.IOException;
public class RectangleTest 
{
	public static void main(String[] args) throws IOException 
	{
		Rectangle rap=new Rectangle();
		JFrame app=new JFrame();
		app.add(rap);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(500,500);
	}
}