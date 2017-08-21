/*This class will set and get for gradeprocessor*/
import javax.swing.JOptionPane;
import java.io.IOException;
import javax.swing.JFrame;
public class GradeProcessorTest 
{
	public static void main(String[] args) throws IOException 
	{
		GradeProcessor gp=new GradeProcessor();
		String input;
		input=JOptionPane.showInputDialog("Enter size: ");
		gp.setSize(Integer.parseInt(input));
		gp.setArray();
		gp.displayMessage();
		JFrame app=new JFrame();
		app.add(gp);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(500,500);
		app.setVisible(true);
	}
}