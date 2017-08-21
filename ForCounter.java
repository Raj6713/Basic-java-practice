/*Write a program which will show working of the for counter*/
import javax.swing.JOptionPane;
public class ForCounter 
{
	private String message;
    private int start,end;

    public ForCounter()
    {
    	start=end=0;
    }

    public void setStart(int n){start=n;}
    public void setEnd(int n){end=n;}

    private int getStart(){return start;}
    private int getEnd(){return end;}

    private void calculation()
    {
    	message="For loop counter:"+Integer.toString(getStart())+
    	         " to "+Integer.toString(getEnd())+"\n";
    	 for(int i=start;i<=end;i++)
    	 	message+=Integer.toString(i)+" ";
    }

    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }
}