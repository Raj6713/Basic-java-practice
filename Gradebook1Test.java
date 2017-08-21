/*Write a program which will show the working of gradebook1 class 
and show the output*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class Gradebook1Test 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String name;
		Gradebook1 book=new Gradebook1();
        System.out.println("Enter courseName: ");
        name=input.readLine();
        book.displayMessage(name);

	}
}