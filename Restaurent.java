/*This program will take rating from person for a restaurent and
than will summerise them in the view*/
import javax.swing.JOptionPane;
import java.util.Random;
public class Restaurent 
{
	private String message;
	private int ratingSize,rating[],rated[];
	public Restaurent()
	{
		ratingSize=0;
		message="";
		rated=new int[11];
	}

	public void setRatingSize(int n){ratingSize=n;rating=new int[n];}
	private int getRatingSize(){return ratingSize;}
    
    private void calculation()
    {
    	//Rating from 1 to 10.
    	Random customerRating=new Random();
    	for(int i=0;i<getRatingSize();i++)
    	{
    		rating[i]=1+customerRating.nextInt(10);
    		++rated[rating[i]];
    	}

    	message="Rating for the given:\n";
    	for(int i=10;i>0;i--)
    	{
    		message+=Integer.toString(i)+" : "+Integer.toString(rated[i])+"\n";
    	}
    }

    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }


}