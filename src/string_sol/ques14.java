
package string_sol;
import java.util.*;
public class ques14
{
  
    public static void main(String args[])
    {
       String s1 = "15 august is independence day";
        String s2 = s1.replace("15 august", "26 january");
        String s3 = s2.replace("independence", "republic");
        System.out.println(s3);
    }
}
