/*This program is an extension program which will roundup value
decided by the menu*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class RounderP 
{
	private String message;
	private double num;
	public RounderP()
	{
		message="";
		num=0.0;
	}
	public void setNum(double n){num=n;}
	private double getNum(){return num;}
	public void displayMessage()
	{
		calculation();
		JOptionPane.showMessageDialog(null,message);
        
	}

	private void calculation()
	{
		String message;
		message="1> For Integer\n2> For tenth\n3>For Hundredth\n4>For thousandth";
		message=JOptionPane.showInputDialog(message);
		switch(Integer.parseInt(message))
		{
			case 1:
			roundToInteger();
			break;

			case 2:
			roundToTenth();
			break;

			case 3:
			roundToHundredth();
			break;

			case 4:
            roundToThousandth();
			break;
			default:
			JOptionPane.showMessageDialog(null,message);
		}

	}

	private void roundToInteger()
	{
        message="Number is:"+Double.toString(getNum())+"\n";
        message+="Rounded to Integer: "+Integer.toString((int)Math.floor(getNum()+0.5));
	}

	private void roundToTenth()
	{
		message="Number is:"+Double.toString(getNum())+"\n";
		message+="Rounded to tenth place:"+Double.toString(Math.floor(getNum()*10+0.5)/10);

	}

	private void roundToHundredth()
	{
      message="Number is:"+Double.toString(getNum())+"\n";
      message+="Rounded to tenth place:"+Double.toString(Math.floor(getNum()*100+0.5)/100);
	}

	private void roundToThousandth()
	{
      message="Number is:"+Double.toString(getNum())+"\n";
      message+="Rounded to tenth place:"+Double.toString(Math.floor(getNum()*1000+0.5)/1000);
	}


}