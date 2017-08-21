/*Write a program which will test working of this*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class EmployeeTest
{
	public static void main(String[] args) throws IOException
	{
		Employee emp1=new Employee("Raj","Kumar",100000.0);
		Employee emp2=new Employee("Gourav","Mehta",190000.0);
		emp1.displayMessage();
		emp2.displayMessage();
		String nu=JOptionPane.showInputDialog("Enter Interest rate: ");
        double num=Double.parseDouble(nu);
        emp1.Incr(num);
        emp2.Incr(num);
        emp1.displayMessage();
        emp2.displayMessage();  
	}

}