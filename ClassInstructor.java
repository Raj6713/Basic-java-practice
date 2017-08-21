/*Write a program which will take course and course Instructor*/
import javax.swing.JOptionPane;
public class ClassInstructor 
{
	private String courseName,instructor;

	public ClassInstructor(String name,String teacher) 
	{
		courseName=name;
		instructor=teacher;
	}

	public void setcourseName(String name)
	{
		courseName=name;
	}

	public void setInstructor(String teacher)
	{
		instructor=teacher;
	}

	public String getcourseName()
	{
		return courseName;
	}
	public String getInstructor()
	{
		return instructor;
	}

	public void displayMessage()
	{
		String message;
		message="Name of Course: "+getcourseName()+"\n"+"Name of Instructor: "+getInstructor();
		JOptionPane.showMessageDialog(null,message);
	}
}