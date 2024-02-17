import java.util.*;

public class ss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int u = 0;
        int x = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int l = 0; l < a.length - 1; l++) {

            x = Integer.MAX_VALUE;

            for (int j = l; j < a.length; j++) {
                if (x > a[j]) {
                    x = a[j];
                    u = j;
                }

            }

            int temp = a[l];
            a[l] = x;
            a[u] = temp;

        }
        for (int y = 0; y < a.length; y++) {
            System.out.println(a[y]);
        }
        sc.close();
    }
}