/*Write a program which will find the first number after the the 100 which
is product of 3*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class chap4e2 
{
	public static void main(String[] args) throws IOException
	{
		int product=3;
		while(product<=100)
			product=product*3;
		String message=Integer.toString(product);
		JOptionPane.showMessageDialog(null,message);
	}

}