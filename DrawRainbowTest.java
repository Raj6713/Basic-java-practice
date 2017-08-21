/*This class will set and get results for the following*/
import javax.swing.JFrame;
import java.io.IOException;
public class DrawRainbowTest 
{
	public static void main(String[] args) throws IOException
	{
		DrawRainbow rainbow=new DrawRainbow();
		JFrame app=new JFrame();
		app.add(rainbow);
		app.setSize(500,500);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}