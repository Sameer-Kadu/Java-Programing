import java.util.*;

public class ahse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (a[i] == a[j]) {
                        c++;

                    } else {
                        continue;
                    }

                }
            }
        }
        if (c > 0) {
            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");

        }

        sc.close();
    }
}