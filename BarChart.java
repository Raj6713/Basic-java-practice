/*Write a program which will take input for the array and create barchart*/
import javax.swing.JOptionPane;
pubic class BarChart 
{
	private String message;
	private int size,arr[];
	public BarChart()
	{
		size=0;
	}
	public void setSize(int n){size=n;arr=new int[size];}
	private void calculate()
	{
        String p;
        for(int i=0;i<arr.length;i++)
        {
        	p=JOptionPane.showInputDialog("Enter A[%d]",i);
        	 arr[i]=Integer.parseInt(p); 
        }
        barChart();
	}
	private void barChart()
	{
       message="Bar Chart for class performance: \n"+;
       
	}



	public void displayMessage()
	{
		calculate();
		JOptionPane.showMessageDialog(null,message);
	}
}
