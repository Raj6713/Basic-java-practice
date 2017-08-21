/*This class will create and populate and array and will show them.*/
import javax.swing.JOptionPane;
public class Array2 
{
	private String message;
	private int arr[],size;
	public Array2(){size=0;}
	public void setSize(int n){size=n;arr=new int[size];}
	private void calculate()
	{
		message="Index Value:\n";
		for(int i=0;i<arr.length;i++)
		{
           arr[i]=2*i;
           message+=Integer.toString(i)+" "+Integer.toString(arr[i])+"\n";
		}
	}

	public void displayMessage()
	{
		calculate();
		JOptionPane.showMessageDialog(null,message);
	}

}