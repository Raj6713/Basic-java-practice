/*a) Declare a constant ARRAY_SIZE that is initialized to 10.
b) Declare an array with ARRAY_SIZE elements of type double, and initialize the elements
to 0.
c) Refer to array element 4.
d) Assign the value 1.667 to array element 9.
e) Assign the value 3.333 to array element 6.
f) Sum all the elements of the array, using a for statement. Declare the integer variable x
as a control variable for the loop.*/
import javax.swing.JOptionPane;
public class ArrayEx 
{
	private String message;
	private int ARRAY_SIZE=10;
	private double arr[]=new double[ARRAY_SIZE];
	public void showArray4()
	{
		JOptionPane.showMessageDialog(null,Double.toString(arr[4]));
		arr[9-1]=1.667;
		arr[6-1]=3.333;
	}
	public void sumThem()
	{
		double sum=0.0;
		for(int i=0;i<arr.length;i++)
             sum+=arr[i];
         JOptionPane.showMessageDialog(null,Double.toString(sum));
	}
}