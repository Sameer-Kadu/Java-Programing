import java.util.*;

public class ftpa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(pivot(a));

        sc.close();
    }

    public static int pivot(int a[]) {
        Scanner sc = new Scanner(System.in);
        int s[] = new int[a.length];
        for (int l = 0; l < a.length; l++) {
            s[l] = a[l];
        }
        int m = (a.length - 1) / 2;
        for (int j = 0; j < a.length; j++) {
            if ((m + j) >= a.length) {
                s[j] = a[j - (m + 1)];
            } else {
                s[j] = a[m + j];
            }
        }

        int b = sc.nextInt();
        sc.close();
        for (int w = 0; w < a.length; w++) {
            if (s[w] == b) {
                return w;
            }

        }

        return -1;

    }
}

