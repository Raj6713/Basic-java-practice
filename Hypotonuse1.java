/*Write a progra which will calculate and draw hypotonuse when other two sides are 
provided*/
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.lang.Math;
public class Hypotonuse1 extends JPanel 
{
	private String message;
	private double base,height;
	public Hypotonuse1()
	{
		base=height=0.0;
	}

	public void setBase(double num){base=num;}
	public void setHeigh(double num){height=num;}

	public double getBase(){return base;}
	public double getHeigh(){return height;}

	private void calculate()
	{
		message="Base: "+Double.toString(getBase())+"\n"+
		        "Height: "+Double.toString(getHeigh())+"\n"+
		        "Hypotonuse: "+Double.toString(Math.sqrt(Math.pow(getBase(),2)+Math.pow(getHeigh(),2)));		        
	}

	public void displayMessage()
	{
		calculate();
		JOptionPane.showMessageDialog(null,message);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawLine(50,300,50+(int)getBase(),300);
		g.drawLine(50,300,50,300-(int)getHeigh());
		g.drawLine(50,300-(int)getHeigh(),50+(int)getBase(),300);
	}
}