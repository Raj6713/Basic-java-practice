/*Write a program which will show the scope variable working and ouput them.*/
public class Scope 
{
	private int x=1;

	public void play()
	{
       int x=5;
       useLocalVariable();
       useField();
       useLocalVariable();
       useField();
	}

	public void useLocalVariable()
	{

        int x=25;
        System.out.printf("User field variable on enter %d\n",x);
		++x;
		System.out.printf("User field variable on exit %d\n",x);
	}

	public void useField()
	{
	
		System.out.printf("User field variable on enter %d\n",x);
		x=x*10;
		System.out.printf("User field variable on exit %d\n",x);
	}
}
