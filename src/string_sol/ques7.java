
package string_sol;
import java.util.*;
public class ques7
{
  
    public static void main(String args[])
    {
        String s;int i=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.next();
        
       String a[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int b[]={1,2,3,4,5,6,7};
        for(i=0;i<7;i++)
        {
            if(s.equalsIgnoreCase(a[i]))
            {
                System.out.print("Day number is "+b[i]);
                break;
            }
         }
    }
}
