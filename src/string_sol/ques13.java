
package string_sol;
import java.util.*;
public class ques13
{
  
    public static void main(String args[])
    {
        String s,s1;int r;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        s1 = in.nextLine();
       r = s.compareToIgnoreCase(s1);
       if(r == 0)
       {
           System.out.println("Same string");
       }
       else if(r>0)
       {
           System.out.println(s  + " Comes later");  
       }
       else
       {
           System.out.println(s1 + " comes later");
       }
        
    }
}
