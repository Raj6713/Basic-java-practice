/*Write a program which will show working of the do while*/
import javax.swing.JOptionPane;
public class DoWhile 
{
	private String message;
	private int start,end;
	public DoWhile()
	{
		start=end=0;
	}

	public void setStart(int n){start=n;}
	public void setEnd(int n){end=n;}

	private int getStart(){return start;}
	private int getEnd(){return end;}

	private void calculation()
	{
		int i=start;
		message="While loop: "+Integer.toString(start)+" "+
		         Integer.toString(end)+"\n";
		do
		{
			message+=Integer.toString(i)+" ";
			i++;

		}while(i<=end);
	}

	public void displayMessage()
	{
		calculation();
		JOptionPane.showMessageDialog(null,message);
	}
}