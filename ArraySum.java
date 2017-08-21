/*Write a program which will create and store a array and will sum all 
values*/
import javax.swing.JOptionPane;
public class ArraySum 
{
	private String message;
	private int size,arr[],sum;
	public ArraySum(){size=0;sum=0;}
	public void setSize(int n){size=n;arr=new int[size];}
	private void calculate()
	{
		message="Index  Value\n";
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=2*i+i+1;
			message+=Integer.toString(i)+"  "+Integer.toString(arr[i])+"\n";
			sum+=arr[i];
		}
		message+="Sum is: "+Integer.toString(sum);
	}
    
    public void displayMessage()
    {
    	calculate();
    	JOptionPane.showMessageDialog(null,message);
    }

}