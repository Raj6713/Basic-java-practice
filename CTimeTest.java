/*Write a program which will test this time class and show output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class CTimeTest 
{
	public static void main(String[] args) throws IOException 
	{
		CTime1 ct=new CTime1();
		int a,b,c;
		String input;
		input=JOptionPane.showInputDialog("Enter time (h,m,s): ");
        a=Integer.parseInt(input.split(" ")[0]);
        b=Integer.parseInt(input.split(" ")[1]);
        c=Integer.parseInt(input.split(" ")[2]);   
		ct.setTime(a,b,c);
	    ct.displayMessage();

	}
}