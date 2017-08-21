/*Write a program which will take and work on the countered product*/
import javax.swing.JOptionPane;
public class Countered 
{
	String message;
	private int upperLimit;
	public Countered()
	{
		upperLimit=0;
	}

	public void setUpperLimit(int n){upperLimit=n; calculate(); }
	public int getUpperLimit(){return upperLimit;}

	private void calculate()
	{
		message="N 10*N 100*N 1000*N\n";
		if(upperLimit>1)
		{
			for(int i=1;i<=getUpperLimit();i++)
				message+=Integer.toString(i)+"  "+Integer.toString(10*i)+"  "+
			             Integer.toString(100*i)+" "+Integer.toString(1000*i)+"\n";

		}
		else
		{
			for(int i=1;i<=getUpperLimit();i--)
				message+=Integer.toString(i)+" "+Integer.toString(10*i)+" "+
			             Integer.toString(100*i)+" "+Integer.toString(1000*i)+"\n";
		}
	}

	public void displayMessage()
	{
		JOptionPane.showMessageDialog(null,message);
	}
}