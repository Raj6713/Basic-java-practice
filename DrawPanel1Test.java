/*This program will check working of the DrawPanel and will show it on
screen.*/
import javax.swing.JFrame;
import java.io.IOException;
public class DrawPanel1Test 
{
	public static void main(String[] args) throws IOException 
	{
		DrawPanel1 panel=new DrawPanel1();
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,400);
		application.setVisible(true);
	}
}