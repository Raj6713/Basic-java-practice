/*Write a program which will create a time class */
import javax.swing.JOptionPane;
public class CTime1 
{
	private String message;
	private int hour,minute,second;
	public CTime1()
	{
		hour=minute=second=0;
		message="";
	}
	public void setTime(int n1,int n2,int n3)
	{
		hour=((n1>=0 && n1<24)?n1:0);
		minute=((n2>=0 && n2<60)?n2:0);
		second=((n3>=0 && n3<0)?n3:0);
	}

	public String toUniversalString()
	{
		return String.format("%02d : %02d : %02d",hour,minute,second);
	}

	public String toString()
	{
		return String.format("%02d : %02d :%02d %s",((hour==0)||(hour==12)?12:(hour%12)), minute, second, (hour<12?"AM":"PM") );
	}

	public void displayMessage()
	{
		System.out.printf("Universal time is : \n %s",toUniversalString());
		System.out.printf("To String: \n %s",toString());
	}
}

