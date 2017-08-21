/*Write a  program which will add two numbers and show the sum difference product and division*/
import java.util.Scanner;
public class chap2p2 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num1,num2,sum,product,difference,div;
		System.out.println("Enter first number: ");
		num1=input.nextInt();
		System.out.println("Enter second number: ");
		num2=input.nextInt();
		sum=num1+num2;
		product=num1*num2;
		difference=num1-num2;
		div=num1/num2;
		System.out.printf("Sum is %d\n",sum);
		System.out.printf("Product is %d\n",product);
		System.out.printf("difference is %d\n",difference);
		System.out.printf("division is %d\n",div);
	}
}