/*Write a program which will show working of get and set methods*/
public class Gradebook2 
{
	
	
		private  String courseName;
		public void setName(String name)
		{
			courseName=name;
		}

		public String getName()
		{
			return courseName;
		}

		public  void displayMessage()
		{
			System.out.printf("Name of course:\n%s",getName());
		}
	
}