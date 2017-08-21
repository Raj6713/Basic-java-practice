/*Write a program which will loop sum values between lower and upper
bound*/
import javax.swing.JOptionPane;
public class LoopSum 
{
	private String message;
    private int start,end;
    public LoopSum()
    {
    	start=end=0;
    }

    public void setStart(int n){start=n;}
    public void setEnd(int n){end=n;}

    private int getStart(){return start;}
    private int getEnd(){return end;}

    private void calculation()
    {
    	int su=0;
    	message="Sum of even between"+Integer.toString(start)+
    	" to "+Integer.toString(end)+"\n";
    	for(int i=start;i<=end;i++)
    	{
    		if(i%2==0)
      		{ su+=i;
    			message+=Integer.toString(i)+" ";
    		}

    	}
    	message+="\nSum is: "+Integer.toString(su);
    }

    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }
}