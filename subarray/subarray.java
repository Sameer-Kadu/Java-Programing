import java.util.*;

public class subarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        pair(a);
        sc.close();
    }

    public static void pair(int a[]) {
        int u = 0, k = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int s = i; s <= j; s++) {
                    System.out.print(a[s]);
                    u = u + a[s];
                }
                System.out.print(" --> sum is: " + u);
                if (k < u) {
                    k = u;
                }

                u = 0;

                System.out.println();
            }
            System.out.println();

        }

        System.out.println("largest sum is: " + k);

    }
}