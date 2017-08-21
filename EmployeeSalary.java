/*This program will create a class for employees and will show their monthly
salary and show it on screen*/
import javax.swing.JOptionPane;
public class EmployeeSalary 
{
	private String message,input,name;
	private int hours;
	private double rate,totalPay;

	public EmployeeSalary()
	{
		name=" ";
		hours=0;
		rate=0.0;
		totalPay=0.0;
	}

	public void setName(String n){name=n;}
	public void setHours(int n){hours=n;}
	public void setRate(double b){rate=b;}

	private String getName(){return name;}
	private int getHours(){return hours;}
	private double getRate(){return rate;}

	public void calculate()
	{
		message="Employee Name: "+getName()+"\n"+
		        "Hourly Rate: "+Double.toString(rate)+"\n"+
		        "Number of hours: "+Integer.toString(hours)+"\n";
		        if(hours>40)
		        totalPay=(hours-40)*(1.5*rate)+40*rate;
		        else
		        	totalPay=rate*hours;
		message+="Total pay is: $"+Double.toString(totalPay);
	}

	public void displayMessage()
	{
		JOptionPane.showMessageDialog(null,message);
	}
}