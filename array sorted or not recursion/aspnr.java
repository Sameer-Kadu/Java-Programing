import java.util.*;
public class aspnr
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a[] = new int[5];
            for(int i=0;i<a.length;i++)
            {
                a[i] = sc.nextInt();
            }
            int s=0;
            System.out.println(Sorted(a,s));
            sc.close();
         }
         public static boolean Sorted(int a[], int s)
         {
            if(s == a.length-1)
            {
                return true;
            }
            if(a[s] > a[s+1])
            {
                return false;
            }
            return Sorted(a, s+1);
         }
}