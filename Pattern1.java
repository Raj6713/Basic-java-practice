/*Write a program which will create a pattern and show it on screen.*/
import javax.swing.JOptionPane;
public class Pattern1 
{
	private String message;
	private int size;
	public Pattern1()
	{
		message="";
		size=0;
	}

	public void setSize(int n){size=n;}
	private int getSize(){return size;}

	private void patternBuilder()
	{
		for(int i=0;i<getSize();i++)
		{
			for(int j=0;j<getSize();j++)
				message+="* ";
			message+="\n";
		}
	}

	public void displayMessage()
	{
		patternBuilder();
		JOptionPane.showMessageDialog(null,message);
	}
}