/*Write a program which will show the workinf of the principal class
and show output.*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Principal 
{
	private String message;
	private double prin,intRate;
	private int years;
	public Principal()
	{
		prin=intRate=0.0;
		years=0;
	}

	public void setPrin(double n1){prin=n1;}
	public void setIntRate(double n1){intRate=n1;}
	public void setYears(int n1){years=n1;}

	private double getPrin(){return prin;}
	private double getIntRate(){return intRate;}
	private int getYears(){return years;}

	private void calculation()
	{
		double amount;
		message="Principal:"+Double.toString(getPrin())+"\n"+
		        "Interest rate: "+Double.toString(getIntRate())+"\n"+
		        "Years: "+Integer.toString(getYears());
		for(int i=0;i<=years;i++)
		{
			amount=getPrin()*Math.pow(1+getIntRate(),i);
			message+=Integer.toString(i)+" "+Double.toString(amount)+"\n";
		}

	}

	public void displayMessage()
	{
        calculation();
        JOptionPane.showMessageDialog(null,message);
	}
}