import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class chap2p5 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter a number: ");
		num=Integer.parseInt(input.readLine());
		if(num%2==0)
			System.out.printf("%d is an even number\n",num);
		else
			System.out.printf("%d is an odd number\n",num);
	}
}