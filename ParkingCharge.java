/*Write an application which will take the hours and will print the
rental accordingly*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class ParkingCharge 
{
	private String message;
	private Double charges,hours;
	private int hour;
	public ParkingCharge()
	{
		message="";
		charges=0.0;
		hours=0.0;
		hour=0;
	}
	public void setHours(double n){hours=n;}
	public double getHours(){return hours;}
	private void setHour(double p){hour=(int)Math.ceil(getHours());}
	public int getHour(){return hour;}

	private void parkingCal()
	{
		setHour(getHours());
		if(getHour()>24)
			charges=10.00;
		else if
		{
			if(getHour()>3)
				charges=(getHour()-3)*0.5 +2.0;
			else
				charges=2.0;

		}
		message="Hours: "+Double.toString(getHours())+"\n"+
		         "Total Charge: "+Double.toString(charges);


	}

	public void displayMessage()
	{
		parkingCal();
		JOptionPane.showMessageDialog(null,message);
	}
}