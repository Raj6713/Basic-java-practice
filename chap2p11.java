
/*Write a program which will take five numbers and positive, negative and zero*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class chap2p11 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int pos,neg,zero,num;
		pos=neg=zero=0;
		System.out.println("Enter first number: ");
        num=Integer.parseInt(input.readLine());
        if(num>0)
        	pos++;
        if(num<0)
        	neg++;
        if(num==0)
        	zero++;

        System.out.println("Enter second number: ");
        num=Integer.parseInt(input.readLine());
        if(num>0)
        	pos++;
        if(num<0)
        	neg++;
        if(num==0)
        	zero++;

        System.out.println("Enter third number: ");
        num=Integer.parseInt(input.readLine());
        if(num>0)
        	pos++;
        if(num<0)
        	neg++;
        if(num==0)
        	zero++;

        System.out.println("Enter fourth number: ");
        num=Integer.parseInt(input.readLine());
        if(num>0)
        	pos++;
        if(num<0)
        	neg++;
        if(num==0)
        	zero++;

        System.out.println("Enter fifth number: ");
        num=Integer.parseInt(input.readLine());
        if(num>0)
        	pos++;
        if(num<0)
        	neg++;
        if(num==0)
        	zero++;
        System.out.printf("Positive: %d\n",pos);
        System.out.printf("Negative: %d\n",neg);
        System.out.printf("Zero:  %d\n",zero);
	}
}