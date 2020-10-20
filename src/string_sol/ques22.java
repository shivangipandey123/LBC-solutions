
package string_sol;
import java.util.*;
public class ques22 {
    public static void main(String[] args)
    {
        System.out.println("enter any String");
        Scanner in = new Scanner(System.in);
        String w="";
        char ch;
        int w1,j;
        String str = in.nextLine();
        str = str + " ";
        
        for(int i =0 ; i< str.length();i++)
        {
            ch = str.charAt(i);
            if(ch!= ' ') 
            {
              w = w + ch;  
            }
            else
            {
                 w1 = w.length();
                for( j =0 ; j<w1-1;j++)
                {
                    if(w.charAt(j) == w.charAt(j+1))
                    {
                        break;
                        
                    }
                }
                    if(j<w1-1)
                    {
                        System.out.println(w);
                    }
                    w = "";
                }
            
        }
    }
}

    


