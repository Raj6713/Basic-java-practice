/*Write a program which will take three number and will show smallest largest, sum,product,average*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class chap2p4 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,num3,smallest,largest,product,sum;
		double average;
		System.out.println("Enter first number: ");
		num1=Integer.parseInt(input.readLine());
		System.out.println("Enter second number: ");
		num2=Integer.parseInt(input.readLine());
		System.out.println("Enter third number: ");
		num3=Integer.parseInt(input.readLine());
        sum=num1+num2+num3;
        product=num1*num2*num3;
        average=(float)sum/3;

       if(num1>=num2 && num1>=num3)
       	largest=num1;
       else if(num2>=num1&& num2>=num3)
       	largest=num2;
       else
       	largest=num3;

       if(num1<=num2 && num1<=num3)
       	smallest=num1;
       else if(num2<=num3 && num2<=num3)
       	smallest=num2;
       else 
       	smallest=num3;

       System.out.printf("Sum is %d\n",sum);
       System.out.printf("Product is %d\n",product);
       System.out.printf("Average is %.2f\n",average);
       System.out.printf("Smallest is %d\n",smallest);
       System.out.printf("Largest is %d\n",largest);


	}
}