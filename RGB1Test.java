import java.io.IOException;
import javax.swing.JFrame;
public class RGB1Test 
{
	public static void main(String[] args) throws IOException
	{
		RGB1 r=new RGB1();
		JFrame app=new JFrame();
		app.add(r);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		app.setSize(400,400);
	}
}