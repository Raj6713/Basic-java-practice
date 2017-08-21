/*Write a program which will take input and put color in them in concentric*/
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class RGB1 extends JPanel
{
   private int r,g1,b;
   public RGB1()
   {
   	r=g1=b=0;
   }

   public void paintComponent(Graphics g)
   {
   	super.paintComponent(g);
   

    for(int i=0;i<255;i++)
    {
        Color p=new Color((r+i)%255,(g1+50*i)%255,(b+50*i)%255);
    	g.setColor(p);
    	g.drawOval(15+i,15,i,i);
    }
   }

}