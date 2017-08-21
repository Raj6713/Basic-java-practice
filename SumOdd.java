/*This program will add the odd numbers between the limits*/
import javax.swing.JOptionPane;
public class SumOdd 
{
	private String message;
	private int start,end,oddSum;
	public SumOdd()
	{
		start=end=oddSum=0;
	}
    public void setStart(int n){start=n;}
    public void setEnd(int n){end=n;}
    
    private void calculation()
    {
    	message="Sum of odd number within range: "+Integer.toString(start)+
    	        " "+Integer.toString(end)+"\n";
        for(int i=start;i<=end;i++)
        {
        	if(i%2!=0)
        		oddSum+=i;
        }
      message+="sum is:"+Integer.toString(oddSum);
    }

    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    } 
}
