import javax.swing.JOptionPane;
public class ArrayEx3 
{
	//Write a statement that declares and creates t.
	private String message;
	private int row,column,t[][];
    public ArrayEx3 
    {
    	message="";
    	row=3;
    	column=4;
    }
 //How many rows does t have?
 public int getRow(){return row;}
 //How many columns does t have?
 public int getColumn(){return column;}
 //How many elements does t have?
 public int getElementCount(){return row*column;} 
 //Write access expressions for all the elements in row 1 of t.
 public String firstRow()
 {
 	message="First row of the given array: \n";
 	int i,j;
 	for(i=0,j=0;j<getColumn();j++)
 		message+=Integer.toString(t[i][j])+" ";
 }


 //Write access expressions for all the elements in column 2 of t.
  public String getColumnTwo()
  {
  	message="Column two of the given array: \n";
     int i,j;
  	for(j=1,i=0;i<getRow();i++)
  		message+=Integer.toString(t[i][j])+" ";
  }

 //Write a single statement that sets the element of t in row 0 and column 1 to zero.
    public void setRowCol1()
    {
    	t[0][1]=0;
    } 
 //Write a series of statements that initializes each element of t to zero. Do not use a repetition
//statement.
  public void intializeElements()
  {
  	for(int i=0;i<getRow();i++)
  		for(int j=0;j<getColumn();j++)
  			t[i][j]=0;
  }
   
 //Write a nested for statement that initializes each element of t to zero.
    public void initializeElements2()
    {
    	for(int i=0;i<getRow();i++)
    		for(int j=0;j<getColumn();j++)
    			t[i][j]=0;
    }
// Write a nested for statement that inputs the values for the elements of t from the user.
    public void setArray()
    {
    	String input;
    	for(int i=0;i<getRow();i++)
    	{
    		for(int j=0;j<getColumn();j++)
    		{
    			message="A["+Integer.toString(i)+"]["+Integer.toString(j)+"]";
    			input=JOptionpane.showInputDialog(message);
    			t[i][j]=Integer.parseInt(input);
    		}
    	}
    }
 //Write a series of statements that determines and displays the smallest value in t.
   public String smallest()
   {
   	int small;
   	small=INTEGER.MAX_VALUE;
   	for(int i=0;i<getRow();i++)
   	{
   		for(int j=0;j<getColumn();j++)
   		{
   			if(t[i][j]<small)
   				small=t[i][j];
   		}
   	}
   	message="Smallest number is: "+Integer.toString(small);
   	return message;
   }


//Write a printf statement that displays the elements of the first row of t. Do not use
//repetition.
public void firstRowt()











 Write a statement that totals the elements of the third column of t. Do not use repetition.
Write a series of statements that displays the contents of t in tabular format. List the
column indices as headings across the top, and list the row indices at the left of each row.