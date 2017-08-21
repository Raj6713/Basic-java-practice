/*Write a program which will add two integers*/
import java.util.Scanner;
public class chap2e5
{
	public static void main(String[] args)
	{
     Scanner input=new Scanner(System.in);
     int num1,num2,sum;
     num1=input.nextInt();
     num2=input.nextInt();
     sum=num1+num2;
     System.out.printf("Sum of the number  %d %d %d",num1,num2,sum);
	}
}