/*Write a program which will show the working of Account class*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AccountTest
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        Account raj=new Account(-1.0);
        double credito,debito;
        raj.displayMessage();
        System.out.println("Enter credit Amount: ");
        credito=Double.parseDouble(input.readLine());
        raj.credit(credito);
        raj.displayMessage();
        System.out.println("Enter debit Amount: ");
        debito=Double.parseDouble(input.readLine());
        raj.debit(debito);
        raj.displayMessage();



	}
}