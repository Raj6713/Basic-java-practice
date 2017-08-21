/*Write a program which will create a time class and show the 
working of it*/
import javax.swing.JOptionPane;
public class Date
{
	private String month;
    private int day,year;
    public Date(int n1,int n2,int n3)
    {
       day=n1;  year=n3;
       setMonth(n2);
    }
   public void setDay(int n1){day=n1;}
   
   public void setMonth(int n2){
    switch(n2) 
   {
       case 1:
       month="Jan";
       break;

       case 2:
       month="Feb";
       break;

       case 3:
       month="Mar";
       break;

       case 4:
       month="Apr";
       break;

       case 5:
       month="May";
       break;

       case 6:
       month="Jun";
       break;

       case 7:
       month="July";
       break;

       case 8:
       month="Aug";
       break;

       case 9:
       month="Sep";
       break;

       case 10:
       month="Oct";
       break;

       case 11:
       month="Nov";
       break;

       case 12:
       month="Dec";
       break;

   }

   }
   public void setYear(int n3){year=n3;}

   private int getDay(){return day;}
   private String getMonth(){return month;}
   private int getYear(){return year;}

   public void displayMessage()
   {
   	String m;
   	m="Date is: "+Integer.toString(getDay())+"/"+getMonth()+"/"+Integer.toString(getYear());
    JOptionPane.showMessageDialog(null,m);
   }

}