/*This class will create a program which will create the rectangle and show it
on screens*/
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
public class Rectangle extends JPanel 
{
	private int r,g,b;
	public Rectangle(){r=g=b=0;}

	public void paintComponent(Graphics rec)
	{

        Random rp=new Random();
		super.paintComponent(rec);
		for(int i=0;i<=5;i++)
		{
			r=1+rp.nextInt(256)%256;
			g=1+rp.nextInt(256)%256;
			b=1+rp.nextInt(256)%256;
			Color cp=new Color(r,g,b);
			rec.setColor(cp);
			rec.drawRect(10+i,10+i,300-i,350-i);
		}
	}
} 