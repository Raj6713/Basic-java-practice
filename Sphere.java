/*Write a program which will calculate value for a sphere and show it 
on screen.*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Sphere
{
	private String message;
	private double radius;
	 public Sphere()
	 {
	 	message="";
	 	radius=0.0;
	 }

	 public void setRadius(double n){radius=n;}
	 public double getRadius(){return radius;}

	 public void volumeCal()
	 {
	 	double volume;
	 	message="Radius: "+Double.toString(radius);
        volume=(4/3)*Math.PI*Math.pow(getRadius(),3);
        message+="\nVolume: "+Double.toString(volume);
	 }

	 public void displayMessage()
	 {
	 	JOptionPane.showMessageDialog(null,message);
	 }
}