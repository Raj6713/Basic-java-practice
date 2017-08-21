/*Write a program which will create a employee class and show working of it*/
import javax.swing.JOptionPane;
public class Employee 
{
	String fname,lname;
	Double salary;
	public Employee(String n1,String n2,Double value)
	{
		fname=n1;
		lname=n2;
		salary=value;
	}
    
    public void setFname(String n1){fname=n1;}
    public void setlname(String n1){lname=n1;}
    public void setSalary(Double n1){salary=n1;}

    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public double getSalary(){return salary;}
    
    public void Incr(Double intRate)
    {
    	if(intRate>0.0)
    	{
            salary*=(1+intRate);
    	}
    	else
    	JOptionPane.showMessageDialog(null,"There must be some error");
    }

    public void displayMessage()
    {
    	String message;
    	message="Employee Name: "+getFname()+" "+getLname()+"\n"+
    	         "Salary: "+getSalary();
    	JOptionPane.showMessageDialog(null,message);
    }

   
}