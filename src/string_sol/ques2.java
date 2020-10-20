
package string_sol;
import java.util.*;
public class ques2
{
    public static void main(String args[])
    {
        String s1,s2,s3;int i;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first name");
        s1=in.next();
        System.out.print("Enter the middle name");
        s2=in.next();
        System.out.print("Enter the last name");
        s3=in.next();
        System.out.print(s1+" "+s2+" "+s3+" ");
        System.out.print(s1.charAt(0)+"."+s2.charAt(0)+"."+s3.charAt(0));
            
        }
}
