/*This class will test the working of the java class ClassAvgTest*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ClassAvgTest 
{
	public static void main(String[] args) throws IOException
	{
    ClassAvg class1=new ClassAvg("Motu","Patlu");
    String input;  
    class1.displayMessage();
    input=JOptionPane.showInputDialog("Enter course Name: ");
    class1.setCourse(input);
    input=JOptionPane.showInputDialog("Enter Instructor Name: ");
    class1.setInstructor(input);
    class1.calculateAvg();
    class1.displayMessage();
    }
}