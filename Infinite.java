/*Write a program which will create a program which will print power
of 2 till infinity*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Infinite 
{
	private String message;
    public Infinite()
    {
    	message="";
    }

    public void calculate()
    {
    	message+="Power of two Printed Infinitely";
    	for(int i=0;;i++)
    	{
    		message+=Integer.toString((int)(Math.pow(2, i)))+"\n";
    	}

    }
    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,message);
    }
}