/*Write a program which will check tjhw working of the Employee
salary*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class EmployeeSalaryTest 
{
	public static void main(String[] args) throws IOException
	{
		String input;
		EmployeeSalary e1=new EmployeeSalary();
		EmployeeSalary e2=new EmployeeSalary();
		EmployeeSalary e3=new EmployeeSalary();
		e1.displayMessage();
		e2.displayMessage();
		e3.displayMessage();
		input=JOptionPane.showInputDialog("Enter Name: ");
		e1.setName(input);
		input=JOptionPane.showInputDialog("Enter Hours: ");
		e1.setHours(Integer.parseInt(input));
		input=JOptionPane.showInputDialog("Enter rate: ");
		e1.setRate(Double.parseDouble(input));
		e1.calculate();
		e1.displayMessage();
        
        input=JOptionPane.showInputDialog("Enter Name: ");
		e2.setName(input);
		input=JOptionPane.showInputDialog("Enter Hours: ");
		e2.setHours(Integer.parseInt(input));
		input=JOptionPane.showInputDialog("Enter rate: ");
		e2.setRate(Double.parseDouble(input));
		e2.calculate();
		e2.displayMessage();

		input=JOptionPane.showInputDialog("Enter Name: ");
		e3.setName(input);
		input=JOptionPane.showInputDialog("Enter Hours: ");
		e3.setHours(Integer.parseInt(input));
		input=JOptionPane.showInputDialog("Enter rate: ");
		e3.setRate(Double.parseDouble(input));
		e3.calculate();
		e3.displayMessage();
       
       JOptionPane.showMessageDialog(null,"End of program.");
		

	}
}