/*Write a program which will find the largest number among the given and show
result*/
import javax.swing.JOptionPane;
public class Largest 
{
	private String message,input;
	private int size,large;
	public Largest()
	{
		size=0;
		large=Integer.MIN_VALUE;
	}

    public void setSize(int n){size=n;}

    public int getSize(){return size;}

    public void calculate()
    {

        message="Number Entered:\n";
    	for(int i=0;i<getSize();i++)
    	{
    		input=JOptionPane.showInputDialog("Enter number: ");
            message+=input+"\n";
            if(large<Integer.parseInt(input))
            	large=Integer.parseInt(input);
    	}
    	message+="Largest is: "+Integer.toString(large);
    } 

    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,message);
    }

}