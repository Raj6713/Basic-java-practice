
/*Write a program which will compare two numbers and show the results.*/
import java.util.Scanner;
public class chap2e6 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num1,num2;
		System.out.println("Ente first number: ");
		num1=input.nextInt();
		System.out.println("Enter second number: ");
		num2=input.nextInt();
		if(num1==num2)
			System.out.printf("%d == %d\n",num1,num2);
		if(num1>num2)
			System.out.printf("%d > %d\n",num1,num2);
		if(num1!=num2)
			System.out.printf("%d != %d\n",num1,num2);
		if(num1<num2)
			System.out.printf("%d < %d\n",num1,num2);
		if(num1<=num2)
			System.out.printf("%d <= %d\n",num1,num2);
		if(num1>=num2)
			System.out.printf("%d >= %d\n",num1,num2);
	}
}