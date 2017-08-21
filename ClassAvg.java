/*Write a program which will calculate the class average using Sentinel control*/
import javax.swing.JOptionPane;
public class ClassAvg 
{
	private String input,course,instructor,message;
	private Double marks,avg;
	public ClassAvg(String s1,String s2)
	{
		course=s1;
		instructor=s2;
	}

    public void setCourse(String n1){course=n1;}
    public void setInstructor(String n1){instructor=n1;}

    public String getCourse(){return course;}
    public String getInstructor(){return instructor;}

    public void calculateAvg()
    {
    	
    	avg=0.0;
    	int i=0;
    	message="Course Name: "+getCourse()+"\n"+
    	        "Instructor Name: "+getInstructor()+"\n";

    	while(true)
    	{
            input=JOptionPane.showInputDialog("Enter marks(-1) to exit");
            if(input.equals("-1"))break;
            marks=Double.parseDouble(input);
            i++;
            avg+=marks;
            message+="Student["+Integer.toString(i)+"]:"+input+"\n";
    	}
        avg=avg/(double)i;
        message+="Class Average: "+avg.toString()+"\n";
    }
   
   public void displayMessage()
   {
   	JOptionPane.showMessageDialog(null,message);
   }

}


























