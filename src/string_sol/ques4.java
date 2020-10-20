
package string_sol;
import java.util.*;
public class ques4
{
    public static void main(String args[])
    {
        String s;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=in.nextLine();
        char ch;int count =0;
        for(int i =0 ;i<s.length();i++)
        {
          ch =  Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("Number of vowels " + count);
        
    }
}
