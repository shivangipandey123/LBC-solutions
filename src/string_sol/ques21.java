
package string_sol;
import java.util.*;

public class ques21 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch;
    String st = "";
    System.out.println("Enter the String ");
    String str = in.next();
    int l = str.length();
    for(int i = l-1;i>=0;i--)
    {
        ch = str.charAt(i);
        st = st + ch;
    }
    if(st.equalsIgnoreCase(str))
    {
        System.out.println("Palidrone String");
    }
    else
    {
        System.out.println("Not Palidrone String");
    }
}
}

