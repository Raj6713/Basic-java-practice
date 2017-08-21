/*This class declaration will show the working of the constructor*/
public class Gradebook3 
{
	private String courseName;

	public Gradebook3(String name)
	{
		courseName=name;
	}

	public void setCourseName(String name)
	{
		courseName=name;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void displayMessage()
	{
		System.out.printf("Name of course: %s\n",getCourseName());
	}
}