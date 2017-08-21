/*This program will show the working of the while counter and print
results*/
import javax.swing.JOptionPane;
public class WhileCounter 
{
	private String message;
    private int start,end;

    public WhileCounter()
    {
    	start=0;
    	end=0;    	
    }

    public void setStart(int n){start=n;}
    public void setEnd(int n){end=n;}
    
    private int getStart(){return start;}
    private int getEnd(){return end;}

    private void calculation()
    {
    	message="Loop form: "+Integer.toString(start)+
    	        " : "+Integer.toString(end)+"\n";
    	int i=start;
    	while(i<=end)
    	   {
    	   	message+=Integer.toString(i)+" ";
    	   	i++;
    	   }
    }

    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }
}