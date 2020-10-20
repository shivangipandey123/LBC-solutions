
package string_sol;
import java.util.*;
public class ques19
{
  
    public static void main(String args[])
    {
        String s;int i=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        String r = "";
        char ch;
     
        s = " " + s;
  
        for(i =0;i<s.length();i++)
        {
          ch = s.charAt(i);
          if(ch == ' ')
          {
             r = r + ch;
             i++;
             ch = Character.toUpperCase(s.charAt(i));
          }
          else
              ch = Character.toLowerCase(s.charAt(i));
          r = r + ch;
        }
        System.out.println(r.substring(1));
        
    }
}