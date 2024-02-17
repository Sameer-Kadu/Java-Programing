import java.util.*;

public class rwt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(rainwater(a));
         
        sc.close();
    }

    public static int rainwater(int a[]) {
        int rh[] = new int[a.length];
        int lh[] = new int[a.length];
        int v = 0, t = 0, k = Integer.MIN_VALUE;
        rh[0] = a[0];
        lh[0] = a[0];

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

                // if (k < a[j]) {
                //     k = a[j];
                // }
                k = Math.max(k, a[j]);

            }
            rh[i] = k;
            k = Integer.MIN_VALUE;
         

        }
        k = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)  {
            for (int j = i; j >= 0; j--) {
                if (k < a[j]) {
                    k = a[j];
                }
            }

            lh[i] = k;
            k = Integer.MIN_VALUE;
          
            
        }
        k = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (lh[i] < rh[i]) {
                k = lh[i];
            } else {
                k = rh[i];
            }
            t = k - a[i];
            v = v + t;
        }

      
       return v;

    }
}