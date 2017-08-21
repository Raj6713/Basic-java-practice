/*Write a program which will solve the give problem related to sales
and will show out put on screen.*/
import javax.swing.JOptionPane;
public class Salary 
{
	private String message,inp;
	private double basicPay,salesPay,totalPay;
	private int salarySlot[],employees;
	public Salary()
	{
		employees=0;
		basicPay=200.00;
		salesPay=0.0;
		totalPay=0.0;
		salarySlot=new int[13];
	}

	public void setEmployee(int n){employees=n;}
	private int getEmployee(){return employees;}

	public void setSalary()
	{
		message="Given is the salary Slot in which Employees are: ";
		message+="\n";
		for(int i=0;i<getEmployee();i++)
		{

            inp=JOptionPane.showInputDialog("Enter Employee Sales: ");
            salesPay=Double.parseDouble(inp);
            totalPay=basicPay+0.09*salesPay;
            salSlot(totalPay);
		}
	}

	public void displayMessage()
	{
		for(int i=2;i<11;i++)
		{
			message+="$"+Integer.toString(i*100)+"-"+Integer.toString((i+1)*(100)-1)+
			          " :  "+Integer.toString(salarySlot[i])+"\n";
		}

		JOptionPane.showMessageDialog(null,message);
	}

	private void salSlot(double pay)
	{
		int k;
		k=(int)pay/100;
		switch(k)
		{
			case 2:
			++salarySlot[2];
			break;
			case 3:
			++salarySlot[3];
			break;
			case 4:
			++salarySlot[4];
			break;
			case 5:
			++salarySlot[5];
			break;
			case 6:
			++salarySlot[6];
			break;
			case 7:
			++salarySlot[7];
			break;
			case 8:
			++salarySlot[8];
			case 9:
			++salarySlot[9];
			break;
			default:
			++salarySlot[10];
		}

	}

}