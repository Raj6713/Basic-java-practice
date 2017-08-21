/*This class will show working of the enhanced version of the for and show
output.*/
import javax.swing.JOptionPane;
import java.util.Random;
public class EnhancedFor 
{
	private String message;
	private int arr[],size,sum;
	public EnhancedFor()
	{
		message="";
        size=0;
        sum=0;
	}

	public void setSize(int n){size=n; arr=new int[size];}
	private int getSize(){return size;}

	public void calculator()
	{
		for(int i=0;i<arr.length;i++)
			arr[i]=i*i+2*i+3;
		
		for(int number:arr)
			sum+=number;
	
	message="Sum of given array is: "+Integer.toString(sum);
    }

    public void displayMessage()
    {
    	calculator();
    	JOptionPane.showMessageDialog(null,message);
    }
}