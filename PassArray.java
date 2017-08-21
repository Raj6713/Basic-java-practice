/*Write a program which will show how the working of the array when 
passed to an array works*/
import javax.swing.JOptionPane;
import java.util.Random;
public class PassArray 
{
	private String message;
	private int arr[],size;
	public PassArray()
	{
		message="";
		size=0;
	}

	public void setSize(int p){size=p; arr=new int[p];}
    private int getSize(){return size;}

    private void setArray()
    {
    	for(int i=0;i<arr.length;i++)
    		arr[i]=i*i+2*i+1;
    }

    private String modifyArray(int[] arp)
    {
    	message="Modified array: \n";
        for(int i=0;i<arp.length;i++)
        {
        	arp[i]=i*i;
        	message+=Integer.toString(i)+" : "+Integer.toString(arp[i])+"\n";
        }
        return message;

    }

    private String modifyElement(int p)
    {
    	message="Modified array after element:\n";
        p=p*2;
        for(int i=0;i<arr.length;i++)
        message+=Integer.toString(i)+" : "+Integer.toString(arr[i])+"\n";
        return message;
    }

    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,modifyArray(arr));
    	JOptionPane.showMessageDialog(null,modifyElement(arr[(int)(getSize()-3)]));

    }
}