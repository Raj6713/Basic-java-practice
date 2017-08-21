/*Write a program which will check calculate using the sentinel control
mileage meter and show it on screen*/
import javax.swing.JOptionPane;
public class Mileage
{
	private String message,input;
	private int distance,gallons;
	private double mileage;
     public Mileage()
     {
     	distance=0;
     	gallons=0;
     	mileage=0;
     }
	//public void setDistance(int n){distance=n;}
	//public void setGallons(int n){gallons=n;}

	//private int getDistance(){return distance;}
	//private int getGallons(){return gallons;}
    
    public void calculate()
    {
    	message="Mileage Calculator\n";
    	while(true)
    	{
          input=JOptionPane.showInputDialog("Enter Kms(-1 to exit:)");
          if(input.equals("-1"))break;
          distance+=Integer.parseInt(input);
          message+=input+"\t";  
          input=JOptionPane.showInputDialog("Enter gallons(-1 to exit:)");
          gallons+=Integer.parseInt(input);
          message+=input+"\n";
    	}
    	mileage=(double)distance/(double)gallons;
    	message+="Mileage: "+Double.toString(mileage);
    }

    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,message);
    }


}