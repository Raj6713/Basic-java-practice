/*Write a program which will create array  and will show corresdopdng 
values*/
import javax.swing.JOptionPane;
public class Array1 
{
	private String message;
	private int[] arr=new int[12];
	public Array1(){message="";}
	private void cal()
	{
		message="Index value\n";
		for(int i=0;i<arr.length;i++)
		{
			message+=Integer.toString(i+1
				)+" "+Integer.toString(arr[i])+"\n";
		}
	}

	public void displayMessage()
	{
		cal();
		JOptionPane.showMessageDialog(null,message);
	}

}