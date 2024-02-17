
import java.util.*;
public class que1
{
    public static void keyIndex(int a[], int key, int i)
    {
        if(i == a.length)
        {
            return;
        }
        if ( a[i] == key)
        {
            System.out.print(i+" ");
            keyIndex(a, key, i+1);
            
        }else
        {
            keyIndex(a, key, i+1);
        }
        
    }
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i =0 ;i<a.length;i++)
            {
                a[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            keyIndex(a, key, 0);
            sc.close();
         }
}