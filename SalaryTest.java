/*This program will set values for the salary and will show it on screen
*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class SalaryTest 
{
	public static void main(String[] args) throws IOException 
	{
		Salary sal=new Salary();
		String input;
		input=JOptionPane.showInputDialog("Enter number of Employees: ");
		sal.setEmployee(Integer.parseInt(input));
		sal.setSalary();
		sal.displayMessage();
	}
}