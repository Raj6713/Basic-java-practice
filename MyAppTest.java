
/*This class will test the working of the app and will show it on screen*/
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MyAppTest 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		MyApp account=new MyApp(0.0);
		String messa=account.messagePass();
		JOptionPane.showMessageDialog(null,messa);
		String s1=JOptionPane.showInputDialog("Enter credit: ");
		Double cre=Double.parseDouble(s1);
		account.credit(cre);
		JOptionPane.showMessageDialog(null,account.messagePass());

		String s2=JOptionPane.showInputDialog("Enter debit: ");
		Double deb=Double.parseDouble(s2);
		account.credit(deb);
		JOptionPane.showMessageDialog(null,account.messagePass());

	}
}