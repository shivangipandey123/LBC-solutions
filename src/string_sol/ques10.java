
package string_sol;
import java.util.*;
public class ques10
{
  
    public static void main(String args[])
    {
        String s="Tanya Tripathi";
         String w,w1;
       
        w = s.substring(0,2);//last char is 1 minimum
        w1 =s.substring(5);
        System.out.println(w + "   " + w1);
    }
}
