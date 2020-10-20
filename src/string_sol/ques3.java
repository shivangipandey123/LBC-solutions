
package string_sol;
import java.util.*;
public class ques3 
{
    public static void main(String args[])
    {
        String s;int i,c=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        for(i=0;i<s.length();i++)
        {
        if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
        {
            c++;
         }
        }
        System.out.print("Number of capital letters are "+c);
        
    }
}