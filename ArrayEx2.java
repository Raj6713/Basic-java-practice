/*This program will create and show working of the array classes*/
import javax.swing.JOptionPane;
public class ArrayEx2
{
	private String message;
	private int column,row,arr[][];
	public ArrayEx2()
	{
		column=row=0;
		message="";
	}

	public void setRow(int n){row=n;}
	public void setColumn(int n)
	{
		column=n;
		arr=new int[row][column];
	}

	private int getRow(){return row;}
	private int getColumn(){return column;}

	private void setArray()
	{
		for(int i=0;i<getRow();i++)
		{
			for(int j=0;j<getColumn();j++)
				arr[i][j]=i+j;
		}
	}

	private void formMessage()
	{
		message="The array is given by:\n";
		for(int i=0;i<getRow();i++)
        {			for(int j=0;j<getColumn();j++)
				message+=Integer.toString(arr[i][j])+" ";
				message+="\n";
		}
	}

	public void displayMessage()
	{
	 setArray();
     formMessage();
     JOptionPane.showMessageDialog(null,message);
	}


}