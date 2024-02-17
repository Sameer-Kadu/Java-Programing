import java.util.*;
public class lnia
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a[] = new int[10];
            int s = Integer.MIN_VALUE;
            // int e = Integer.MAX_VALUE;
            for ( int i = 0; i < 10; i++ )
                {
                    a[i] = sc.nextInt();
                }
            for ( int i = 0; i < 10; i++ )
                {
                   if ( s < a[i])
                    {
                        s = a[i];
                    }
                   else
                    {
                        continue;
                    }
                }
            System.out.println("gretest number in array " + s);
            
            sc.close();
         }
}