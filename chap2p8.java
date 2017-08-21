/*Write a program which will take a character and then will output its integer equivalent*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class chap2p8 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		char ch;
		System.out.println("Enter a character: ");
		ch=(char)input.read();
		System.out.printf("Integer equivalent is %d",(int)ch);

	}
}