/*Write a program which will show the working of grade distribution*/
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class chap4e1 
{
	public static void main(String[] args) throws IOException
	{
     String ip=JOptionPane.showInputDialog("Enter Marks(0-100): ");
     double num=Double.parseDouble(ip);
     String message="Grade Obtained: ";

     if(num>90)
     	message+="A";
     else if(num>80)
     	message+="B";
     else if(num>70)
     	message+="C";
     else if(num>60)
     	message+="D";
     else if(num>50)
     	message+="P";
     else 
     	message+="F";
     JOptionPane.showMessageDialog(null,message);
	}
}