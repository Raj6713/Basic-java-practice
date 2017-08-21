/*Write a program which will create a program such that it will  show 
squares and sum of them in a panel*/
import javax.swing.JOptionPane;
public class SquareSum 
{
	private String message;
	private int sum,lowerLimit,upperLimit;
	public SquareSum()
	{
		sum=0;
	}
	public void setLowerLimit(int n){lowerLimit=n;}
	public void setUpperLimit(int n){upperLimit=n;}

	public int getLowerLimit(){return lowerLimit;}
	public int getUpperLimit(){return upperLimit;}

	public void calculate()
	{
		message="Sum of square numbers :\n";
		for(int i=getLowerLimit();i<=getUpperLimit();i++)
			sum+=i*i;
        message+=Integer.toString(sum);
	}

	public void displayMessage()
	{
		JOptionPane.showMessageDialog(null,message);
	}

}