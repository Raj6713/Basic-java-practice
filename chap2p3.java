/*Write a program which will take two numbers and check which number is greater than another*/
import java.util.Scanner;
public class chap2p3
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num1,num2;
		System.out.printf("Enter first number: ");
		num1=input.nextInt();
		System.out.printf("Enter second number: ");
		num2=input.nextInt();
		if(num1==num2)
			System.out.printf("%d is equal to %d",num1,num2);
		else
		{
			if(num1>num2)
				System.out.printf("%d is greater than %d",num1,num2);
			else
				System.out.printf("%d is greater than %d",num2,num1);
		}
	}
}