
package string_sol;
import java.util.*;
public class ques8
{
  
    public static void main(String args[])
    {
        String s;int i=0;char ch1;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        String s1 = "";
        for(i=0;i<s.length();i++)
        {
            
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                ch1=Character.toLowerCase(ch);
            }
            else
            {
                ch1=Character.toUpperCase(ch);
            }
            s1=s1+ch1;
        }
        System.out.print("New string is "+s1);
    }
}

