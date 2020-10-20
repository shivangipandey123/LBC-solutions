
package string_sol;
import java.util.*;
public class ques18
{
  
    public static void main(String args[])
    {
        String s;int i=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
         s = s.toLowerCase();
      
      char ch;
      char j;
      for(j='a';j<='z';j++)
      {
          int count = 0;
         for(i=0;i<s.length();i++)
         {
            ch = s.charAt(i);
            if(ch==j)
            {
               count++; 
            }
         }
          
         if(count>0)
         {
             System.out.println("The Frequency of letter is" + " " + j + " " + count);
         }
      }
        
      
    }
    
}
