/*Write a program which will show the working of the Icrement class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class IncrementTest 
{
	public static void main(String[] args) throws IOException 
	{
		String input;
		Increment inc=new Increment();
	    inc.displayMessage();
	    input=JOptionPane.showInputDialog("Enter number: ");
	    int num=Integer.parseInt(input);
	    inc.setNum(num);
	    input=JOptionPane.showInputDialog("Enter Choice\n1 Pre \n2 Post:");
	    switch(Integer.parseInt(input))
	    {
	    	case 1:
	    	inc.preincrement();
	    	inc.displayMessage();
	    	break;

	    	case 2:
	    	inc.postincrement();
	    	inc.displayMessage();
	    	break;

	    	default:
	    	JOptionPane.showMessageDialog(null,"Wrong Input.");

	    }
	    JOptionPane.showMessageDialog(null,"End of Program.");
	}

}