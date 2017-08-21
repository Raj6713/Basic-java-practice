/*Write a program which will show product of three number*/
import java.util.Scanner;
public class chap2p1 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter three number:");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		int product=num1*num2*num3;
		System.out.printf("Product is given by: %d",product);
	}
}