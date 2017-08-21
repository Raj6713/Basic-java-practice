/*Write a panel which will test the working of the panel class*/
import javax.swing.JFrame;
import java.io.IOException;
public class DrawPanelTest 
{
	public static void main(String[] args) throws IOException 
	{
		DrawPanel panel=new DrawPanel();
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(200,200);
		application.setVisible(true);
	}
}