 import java.util.*;
public class large
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the arrays");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int j,t=0;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
                }
            }
        }
        
        int k=arr[n-1];
        
        for(i=n-1;i>0;i--)
        {
            if(arr[i]!=k)
            {
                System.out.println("THE SECOND LARGEST ELEMENT : " +arr[i]);
                break;
            }
        }
    }
}