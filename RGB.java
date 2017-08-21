/*Write a program which will create a smiley and fill color in them*/
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
public class RGB extends JPanel
{
	private int  red1,green1,blue1;
	public RGB()
	{
		red1=green1=blue1=0;
	}
	public void setRed1(int num){red1=num;}
	public void setGreen1(int num){green1=num;}
	public void setBlue1(int num){blue1=num;}

	private int getRed1(){return red1;}
	private int getGreen1(){return green1;}
	private int getBlue1(){return blue1;}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(10,10,200,200);

		g.setColor(Color.BLACK);
		g.fillOval(55,65,30,30);
		g.fillOval(135,65,30,30);

		g.fillOval(50,110,120,60);

		g.setColor(Color.YELLOW);
		g.fillRect(50,110,120,30);
		g.fillRect(50,110,120,40);
	}
}