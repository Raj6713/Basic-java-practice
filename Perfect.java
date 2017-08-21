/*This program will check whatever a number is perfect or not.*/
import javax.swing.JOptionPane;
public class Perfect 
{
	private String message;
	private int num;
	public Perfect()
	{
		num=0;
	}

	public void setNum(int n){num=n;}
	private int getNum(){return num;}

	public void perfectCal()
	{
		message="Perfect numbers:\n";
		for(int i=2;i<=getNum();i++)
		{
			int sum=0;
          for(int j=1;j<i;j++)
          {

            if(i%j==0)
            	sum+=j;

          }
          if(sum==i)
          	message+="Number is perfect:"+Integer.toString(i)+"\n";
		}

	}

	public void displayMessage()
	{
		perfectCal();
		JOptionPane.showMessageDialog(null,message);
	}
}