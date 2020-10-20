
package string_sol;
import java.util.*;
public class ques9
{
  
    public static void main(String args[])
    {
        String s,s1="";int i=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.next();
       for(i=0;i<s.length();i++)
    {
      s1=s.charAt(i)+s1;
    }
     if(s.equals(s1))
     {
         System.out.println("palidrone");
     }
     else
     {
         System.out.println("Not a palindrome");
     }
 }
}
