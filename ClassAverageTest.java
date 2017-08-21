/*This class will test working of the class Average*/
import java.io.IOException;
import javax.swing.JOptionPane;
public class ClassAverageTest 
{
	public static void main(String[] args) throws IOException 
	{
     ClassAverage biology=new ClassAverage("Biology","Samanth");
     String input;
     biology.displayMessage();
     input=JOptionPane.showInputDialog("Enter CourseName: ");
     biology.setCName(input);
     input=JOptionPane.showInputDialog("Enter Instructor: ");
     biology.setIName(input);
     biology.studentMarks();
     biology.displayMessage();
	}
}