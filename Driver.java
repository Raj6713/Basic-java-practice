/*Write a program which will show the working of the Driver class and will
output the value on screen.*/
import javax.swing.JOptionPane;
public class Driver 
{
	private String instructor,message;
	public Driver(String n1)
	{
		instructor=n1;
	}
	public void setInstructor(String n1){instructor=n1;}

	public String getInstructor(){return instructor;}

	public void calculatePass()
	{
		String input;
		int grade,numOfStudents,i=0,eightPlus=0;
		JOptionPane.showMessageDialog(null,"1. For Pass\n2. For Fail.");
        input=JOptionPane.showInputDialog("How Many Students: ");
        numOfStudents=Integer.parseInt(input);
        message+="Instructor Name: "+getInstructor()+"\n";
        while(i<numOfStudents)
        {
        	input=JOptionPane.showInputDialog("Enter Grade: ");
             message+="Student["+Integer.toString(i+1)+"]: "+input+"\n";
            grade=Integer.parseInt(input);
            if(grade==1)
            	eightPlus++;
            i++;
        }        

        if(eightPlus>(int)0.8*numOfStudents)
        	message+="Promote Instructor\n";
        else
        	message+="Hold Instructor position\n";
	}

	public void displayMessage()
	{
         JOptionPane.showMessageDialog(null,message);		
	}
}









