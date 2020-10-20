
package string_sol;
import java.util.*;
public class ques20
{
public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Plz Enter any Sentences");
        int l,count=0;
        char ch;
        String st = " ";
        String s =in.nextLine();
        s = s + " ";
        l= s.length();
        System.out.println("The Sentence is Greater than 5 words");
        for(int i =0;i<l;i++)
        {
          ch = s.charAt(i);
          if(ch!= ' ')
          {
              st = st + ch; 
          }
          else
          {
              if(st.length()>=5)
              {
                  System.out.println(st);
              }
              
              st = "";
          }
          
          
        }
        
    }
}
