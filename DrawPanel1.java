/*This program will test working of the drawPanel and will show multiple
line on the screen */
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel1 extends JPanel 
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int height=getHeight();
		int width=getWidth();
		for(int i=1;i<=15;i++)
		{
			g.drawLine(0,0,width,height);
			g.drawLine(0,width,height,0);
			width=width-10;
			height=height-10;

		}
	}
}