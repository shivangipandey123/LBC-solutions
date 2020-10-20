
package string_sol;
import java.util.*;
public class ques17
{
  
    public static void main(String args[])
    {
        String s;int i=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
     char ch,ch1;
     String  str = "";
     for(i =0 ;i< s.length(); i++)
     {
        ch = s.charAt(i);
        if(i%2==0)
        {
          ch1 = Character.toLowerCase(ch);
        }
        else
        {
          ch1 = Character.toUpperCase(ch);
        }
         str = str + ch1;
     }
       System.out.print("Resulting String is " + str);
     
   }
   
}
