/*Write a program which will save the RGB class and show*/
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.io.IOException;
public class RGBTest 
{
	public static void main(String[] args) throws IOException
	{
		RGB r1=new RGB();
		JFrame app=new JFrame();
		app.add(r1);
		app.setSize(300,300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		
	}
}