
package string_sol;
import java.util.*;
public class ques11
{
  
    public static void main(String args[])
    {
        String s;int i=0,l;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        String name1,name2,name3 = "";
     
      char ch;
  
      s = s.toLowerCase();
      l = s.length();
      for(i =0;i<l;i++)
      {
        ch = s.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            break;
        }
      }
      name1 = s.substring(0, i);
      name2 = s.substring(i);
      name3 = name2 + name1 + "ay";
      System.out.println("Piglatin form is  " + name3);
    }
    
}

