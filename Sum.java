/*This program will add number from a lower limit to higher and show 
them */
import javax.swing.JOptionPane;
public class Sum 
{
	private String message;
	private int lowerLimit,upperLimit,sum;
	public Sum()
	{
		sum=0;
	}
   public void setLowerLimit(int n){lowerLimit=n;}
   public void setUpperLimit(int n){upperLimit=n;}

   private int getLowerLimit(){return lowerLimit;}
   private int getUpperLimit(){return upperLimit;}

   public void calculate()
   {
   	int i;
   	if(lowerLimit<upperLimit)
   	{
     for(i=lowerLimit;i<=upperLimit;i++)
     	sum+=i;
   	}
   	else
   	{
      for(i=upperLimit;i<=lowerLimit;i++)
      	sum+=i;
   	}
     message="Sum of Number:\n From "+Integer.toString(lowerLimit)+"\n"+
                                "To "+Integer.toString(upperLimit)+"\n"+
                                Integer.toString(sum);
   }

   public void displayMessage()
   {
   	JOptionPane.showMessageDialog(null,message);
   }


}