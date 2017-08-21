/*Write a program which will take a five digit number and seperate them*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class chap2p9
{
  public static void main(String[] args) throws IOException 
  {
  	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    int num,copyNum,a,b,c,d,e;
    System.out.println("Enter a five digit number: ");
    num=Integer.parseInt(input.readLine());
    copyNum=num;
    a=num%10;
    num=num/10;
    b=num%10;
    num=num/10;
    c=num%10;
    num=num/10;
    d=num%10;
    num=num/10;
    System.out.printf("%d is %d %d %d %d %d\n",copyNum,num,d,c,b,a);
  }
}