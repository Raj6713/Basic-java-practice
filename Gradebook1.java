
/*Write a program which will take string output and show the output*/
public class Gradebook1 
{
	private static String courseName;
	public static void displayMessage(String name)
	{
		courseName=name;
		System.out.printf("Name of this course is: %s\n",courseName);
	}
}