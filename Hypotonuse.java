/*This class will take the two double values ans find its hypotonuse 
and draw it*/
import javax.swing.JPanel;
import java.awt.Graphics;
import java.lang.Math;
import javax.swing.JOptionPane;
public class Hypotonuse extends JPanel
{
	private String message;
	private double base,height,hypotonuse;
	public Hypotonuse()
	{
		base=height=hypotonuse=0;
	}

	public void setBase(double n){base=n;}
	public void setHeight(double n){height=n;}

	private double getBase(){return base;}
    private double getHeigh(){return height;}

    private void calculation()
    {
    	hypotonuse=Math.sqrt(Math.pow(getBase(),2)+Math.pow(getHeigh(),2));
    	message="Base: "+Double.toString(getBase())+"\n"+
    	        "height: "+Double.toString(getHeigh())+"\n"+
    	        "Hypotonuse: "+Double.toString(hypotonuse)+"\n";
    }

    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }

    public void paintComponent(Graphics triangle)
    {
    	super.paintComponent(triangle);
    	triangle.drawLine(20,50,20+(int)getBase(),50);
    	triangle.drawLine(20,50,20,50-(int)getHeigh());
    	triangle.drawLine(20,50-(int)getHeigh(),20+(int)getBase(),50);
    }

}