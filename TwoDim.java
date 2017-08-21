/*Write a program which will show the working of the two dimensional
array and show output on screen*/
import javax.swing.JOptionPane;
public class TwoDim 
{
	private String message,inp;
	private int arr1[][],row,col;
	public TwoDim()
	{
		row=col=0;
		message="";
	}
	public void setRow(int n){row=n; }
	public void setCol(int n){col=n; arr1=new int[row][col];}
	private int getRow(){return row;}
	private int getCol(){return col;}

	public void setArray()
	{
		for(int i=0;i<getRow();i++)
		{
			for(int j=0;j<getCol();j++)
			{
				message="Enter a["+Integer.toString(i)+"]["+Integer.toString(j)+"]: ";
               inp=JOptionPane.showInputDialog(message);
               arr1[i][j]=Integer.parseInt(inp);
			}
		}
    }

	private void formMessage()
	{
		message="Given array is: \n";
		for(int i=0;i<getRow();i++)
		{
			for(int j=0;j<getCol();j++)
			{
				message+=Integer.toString(arr1[i][j])+" ";
				
			}
			message+="\n";
		}

	 }
	

    public void displayMessage()
    {
    	formMessage();
    	JOptionPane.showMessageDialog(null,message);
    }
}