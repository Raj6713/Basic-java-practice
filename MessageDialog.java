
/*Write a program which will show message dialog and show output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class MessageDialog 
{
	public static void main(String[] args) throws IOException
	{
		String name=JOptionPane.showInputDialog("What is your name: ");
		String message=String.format("Welcome %s, to java programming",name);
		JOptionPane.showMessageDialog(null,message);
	}


}