
package string_sol;
import java.util.*;
public class ques16
{
  
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,count =0;char ch;
        String arr[] = new String[5];
        System.out.println("Enter the string ");
        for(i =0; i<5 ;i++)
        {
            arr[i] = in.nextLine();
        }
        System.out.println("The names are ");
         for( i =0; i<5 ;i++)
        {
           ch = Character.toLowerCase(arr[i].charAt(0));
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
           {
               System.out.println(arr[i]); 
           }
           
        }
         
    }
}
