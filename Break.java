/*This program will show working of the break and show output on
screen.*/
import javax.swing.JOptionPane;
public class Break 
{
	private String message;
    private int start,end,mid;
    public Break()
    {
    	start=end=0;
    }

    public void setStart(int n){start=n;}
    public void setEnd(int n){end=n;}

    private int getStart(){return start;}
    private int getEnd(){return end;}

    private void calculation()
    {
    	message="Usage of break\n";
    	mid=(int)(start+end)/2;
    	for(int i=start;i<=end;i++)
    	{
    		message+=Integer.toString(i)+" ";
    		if(i==mid)break;
    	}
    	message+="\nLoop broke at: "+Integer.toString(mid);

    }

    public void displayMessage()
    {
    	calculation();
        JOptionPane.showMessageDialog(null,message);
    }
}