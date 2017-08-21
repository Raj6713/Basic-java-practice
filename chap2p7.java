/*Write a program which will calculate the area and diameter of circle*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class chap2p7 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int radius;
		System.out.println("Enter radius: ");
		radius=Integer.parseInt(input.readLine());
		System.out.printf("Circumference is: %.3f units.\n",2*Math.PI*radius);
		System.out.printf("Area is: %.3f square units.\n",Math.PI* radius*radius);
	}
}