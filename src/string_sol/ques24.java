package string_sol;
import java.util.*;
public class ques24 {
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
       String country[] ={"india","France","usa","Jordan","Peru"};
       String wonder[] = {"tajmahal","effil tower"," statue of liberty","Petra","Machu Pichu"};
       String cn;
       int i;
        System.out.println("Enter any country name to serach");
        cn =in.nextLine();
       for( i =0 ;i<7 ;i++)   
       {
        if(country[i].equalsIgnoreCase(cn))
        {
            System.out.println(wonder[i]);
        }
       }
    } 
}
