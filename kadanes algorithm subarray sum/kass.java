import java.util.*;

public class kass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        pair(a);
        sc.close();
    }

    public static void pair(int a[]) {
        int k = Integer.MIN_VALUE;
        int x[] = new int[a.length];
        int r = 0;
        x[0] = a[0];
       
        for (int i = 0; i < a.length; i++) {
           r = r + a[i];
           if ( r < 0)
           {
            r = 0;
           }
           else
           {
            if ( k < r)
            {
                k = r;
            }
           }
        }
        System.out.println(k);

    }

}
