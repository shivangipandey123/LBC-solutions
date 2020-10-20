
package string_sol;
import java.util.*;
public class ques6
{
    public static void main(String args[])
    {
        String s1,s2;int i=0,c=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first string ");
        s1=in.nextLine();
        System.out.print("Enter the second string ");
        s2=in.nextLine();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}