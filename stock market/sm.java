import java.util.*;

public class sm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(stock(a));

        sc.close();
    }

    public static int stock(int a[]) {
        int k = Integer.MAX_VALUE, s = 0, b = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {

                if (k > a[j]) {
                    k = a[j];
                }

            }
            s = a[i] - k;

            if (b < s) {
                b = s;
            }

        }
        return b;
    }
}