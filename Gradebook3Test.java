
/*This class will test working of the class program of Gradebook3*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Gradebook3Test 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Gradebook3 book1=new Gradebook3("Welcome to Java programming");
		Gradebook3 book2=new Gradebook3("Welcome to python programming");
		String name;
		book1.displayMessage();
		book2.displayMessage();
		System.out.println("Enter course name for book1: ");
        name=input.readLine();
        book1.setCourseName(name);

        System.out.println("Enter course name for book2: ");
        name=input.readLine();
        book2.setCourseName(name);

        book1.displayMessage();
		book2.displayMessage();
	}
}