/*Write a program which will show the working of the class Instructor.*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
public class ClassInstructorTest
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		ClassInstructor class1=new ClassInstructor("No Course","No Instructor");
		String cName,instructor;
		class1.displayMessage();
		cName=JOptionPane.showInputDialog("Enter Course Name: ");
		instructor=JOptionPane.showInputDialog("Enter Instructor Name: ");
		class1.setcourseName(cName);
		class1.setInstructor(instructor);
		class1.displayMessage();

	}
}