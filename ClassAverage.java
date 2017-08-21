/*Write a program which will calculate the class average and than will
present it on screen.*/
import javax.swing.JOptionPane; 
public class ClassAverage 
{
	private String courseName,instructor,message;

	private double marks;

	public ClassAverage(String cN,String ins)
	{
		courseName=cN;
		instructor=ins;
	}

    public void setCName(String val){courseName=val;}
    public void setIName(String val){instructor=val;}
    
    public void studentMarks()
    {
    	message="CourseName: "+courseName+"\nInstructor name:"+instructor+"\n";
    	
    	int numStudent,i=0;
    	String input;
    	double average=0;
    	input=JOptionPane.showInputDialog("Enter how many Students: ");
    	numStudent=Integer.parseInt(input);  	
    	while(i<numStudent)
    	{
    		input=JOptionPane.showInputDialog("Marks:(0-100)");
    		message+="Student["+Integer.toString(i+1)+"]: ="+input+"\n";
            marks=Double.parseDouble(input);
            average+=marks;
            i++;
    	}
    	average=average/(double)numStudent;
    	message+="Average: "+Double.toString(average)+"\n";
    } 

    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,message);
    }


}