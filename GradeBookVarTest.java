/*This class will test the working of the GradeBookVar and show
input and ooutpur*/
import javax.swing.JOptionPane;
import java.io.IOException;
import javax.swing.JFrame;
public class GradeBookVarTest 
{
	public static void main(String[] args) throws IOException
	{
		GradeBookVar gb=new GradeBookVar();
		String inp;
		inp=JOptionPane.showInputDialog("Enter subject Name: ");
		gb.setCourseName(inp);
		inp=JOptionPane.showInputDialog("Enter (rows,column): ");
		gb.setColRow(inp);
		gb.displayMessage();
		//Graphics library.
     	JFrame app=new JFrame();
		app.add(gb);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(200,200);
		
	}
}