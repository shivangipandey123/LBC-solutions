
package string_sol;
import java.util.*;
public class ques5
{
    public static void main(String args[])
    {
        String s;int i=0,c=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
               c++;
            }
        }
        System.out.print("Number of words "+(c+1));
    }
}
