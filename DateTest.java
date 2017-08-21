/*This program will test the working of the java Time class and will output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class DateTest 
{
	public static void main(String[] args) throws IOException
	{
		Date d1=new Date(23,10,1992);
		d1.displayMessage();
		int day,year,month;
	    String input;
	    input=JOptionPane.showInputDialog("Enter Day: ");
        day=Integer.parseInt(input);
	    input=JOptionPane.showInputDialog("Enter Day: ");
        month=Integer.parseInt(input);
	    input=JOptionPane.showInputDialog("Enter Day: ");
        year=Integer.parseInt(input);
        d1.setDay(day);
        d1.setMonth(month);
        d1.setYear(year);
        d1.displayMessage();
	}
}