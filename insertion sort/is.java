import java.util.*;
public class is
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a[] = new int [5];
            for (int i = 0 ;i<a.length;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int s = 0;s<a.length-1;s++)
            {
                for(int u =0;u<(s+1);u++)
                {
                if(a[s-u] > a[(s+1)-u] )
                {
                    int temp = a[s-u];
                    a[s-u] = a[(s+1)-u];
                    a[(s+1)-u] = temp;
                }
            }
            }
            for (int q = 0 ;q<a.length;q++)
            {
                System.out.println(a[q]);
            }
            sc.close();
         }
}