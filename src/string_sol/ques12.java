
package string_sol;
import java.util.*;
public class ques12
{
  
    public static void main(String args[])
    {
        String s;int i=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        s = s.toLowerCase();
        if(s.startsWith("mr "))
        {
            System.out.println("Male");
        }
        else if(s.startsWith("miss  "))
        {
            System.out.println("Female");
        }
        else if(s.startsWith("mrs"))
        {
            System.out.println("Married Female");
        }
        else if(s.startsWith("kumari "))
        {
            System.out.println("Un-Married Female");
        }
        else
        {
            System.out.println("Cannot-determine");
        }
    }
}