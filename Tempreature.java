/*Write a program which will show the working of the Tempreature */
import javax.swing.JOptionPane;
public class Tempreature 
{
	private String message;
	private double temp;
	public void Tempreature()
	{
		message="";
		temp=0.0;
	}

	public void setTemp(double n){temp=n;}
	public double getTemp(){return temp;}

	public void displayMessage()
	{
		calculate();
		JOptionPane.showMessageDialog(null,message);
	}
	private void calculate()
	{
        String inp="1> For celsius to Farenhit\n2> For Farenhit to Celsisus\n";
		inp=JOptionPane.showInputDialog(inp);
        switch(Integer.parseInt(inp))
        {
        	case 1:
             celsiusToFarenhit();
        	break;

        	case 2:
             farenhitToCelsius();
        	break;
        	default:
        	JOptionPane.showMessageDialog(null,"Wrong input: ");
        }

	} 

	private void celsiusToFarenhit()
	{  message="";
       message+="Tempreature in celsisu: "+Double.toString(getTemp())+"\n"+
                 "Tempreature in farenhit: "+Double.toString((9.0/5)*getTemp()+32);
	}

	private void farenhitToCelsius()
	{    message="";
         message+="Tempreature in farenhit: "+Double.toString(getTemp())+"\n"+
                 "Tempreature in celsius: "+Double.toString(((5.0/9)*(getTemp()-32)));

	}
}