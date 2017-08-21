/*Write a program which will show the workng of the two dimensional
array where olumn length is variable */
import javax.swing.JOptionPane;
public class TwoDim1 
{
	private String message,input;
	private int b[][],row,col[];
	public TwoDim1()
	{
		message="";
		row=0;
	}

	public void setRow(int n){row=n;}
	public void setCol(String p)
	{
		b=new int[row][];
		col=new int[row];
		for(int i=0;i<row;i++)
			{
				col[i]=Integer.parseInt(p.split(" ")[i]);
				b[i]=new int[col[i]];
			}
	}
	public void setArray()
	{
		message="Setting array:";
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col[i];j++)
			{
				message="A["+Integer.toString(i)+"]["+Integer.toString(j)+"]: ";
				input=JOptionPane.showInputDialog(message);
				b[i][j]=Integer.parseInt(input);
			}
		}
	}

	private void formMessage()
	{
		message="Input array is given by: \n";
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col[i];j++)
				message+=Integer.toString(b[i][j])+" ";
			message+="\n";
		}
		
	}

    public void displayMessage()
    {
    	formMessage();
    	JOptionPane.showMessageDialog(null,message);
    }
}