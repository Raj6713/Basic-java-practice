/*Write a program which will show the workin of the continue */
import javax.swing.JOptionPane;
public class Continue 
{
	private String message;
	private int start,end;
	public Continue()
	{
		start=end=0;
	}
	public void setStart(int n){start=n;}
	public void setEnd(int n){end=n;}

	private void calculation()
	{
		message="Wroking of the Continue statement:\n";
		for(int i=start;i<=end;i++)
		{
			if(i%5==0)continue;
			message+=Integer.toString(i)+" ";
			
		}

	}

	public void displayMessage()
	{
        calculation();
        JOptionPane.showMessageDialog(null,message);
	}
}