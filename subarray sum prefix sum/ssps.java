import java.util.*;

public class ssps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
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
        for (int i = 1; i < x.length; i++) {
            x[i] = x[i - 1] + a[i];

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i == 0) {
                    r = x[j];

                } else {
                    r = x[j] - x[i - 1];
                }
                if (k < r) {
                    k = r;
                }

               System.out.println(r);

            }
        }
        System.out.println(k);

    }

}
