/*Write a program which will create concentric circle and show it*/
import java.awt.Graphics;
import javax.swing.JPanel;
public class Concentric extends JPanel 
{
   private int circles;
   public Concentric()
   {
   	circles=1;
   }
  public void setCircles(int n){circles=n;}

  public void paintComponent(Graphics g)
  {
  	super.paintComponent(g);
  	for(int i=1;i<=circles;i++)
  	{
  		//g.drawOval(200, 200, 10+i*10, 10+i*10);
  		//g.drawOval(10+i*10, 10+i*10, 50,50);
           g.drawOval(50,10+i*10, 10+i*10, 50);
  	}
  }   
}