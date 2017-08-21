/*Write a program which will show a rectangle  printed on screen.*/
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
public class GraphicsRect extends JPanel
{
	private int choice;
    public GraphicsRect()
    {
    	choice=0;
    }
    public void setChoice(int n){choice=n;}
    private int getChoice(){return choice;}

    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	for(int i=0;i<=100;i++)
    	{
    	switch((choice%2)+1)
    	{
    		case 1:
    		g.drawRect(200,200, 10+i*5, 15+i*5);;
    		break;

    		case 2:
    		g.drawOval(200, 200, 50+i*5, 20+i*5);
    		break;

    		default:
    		JOptionPane.showMessageDialog(null,"Wrong choice entered.");
    	}
    }

    }
}