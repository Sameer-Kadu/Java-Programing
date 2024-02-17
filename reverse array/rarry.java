import java.util.*;
public class rarry
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a[] = new int [10];
            for ( int i = 0; i < a.length ; i++)
                {
                    a [i] = sc.nextInt();

                }
            for ( int i = 0; i < a.length/2; i++ )
                {
                    int t = a[i];
                    a[i] = a[a.length - (i+1)];
                    a[a.length - (i+1)] = t;
                 
                    
                }
                System.out.println();
                
            for ( int i = 0; i < a.length; i++ )
                {
                    System.out.println(a[i]);
                    
                }
            sc.close();
         }
}