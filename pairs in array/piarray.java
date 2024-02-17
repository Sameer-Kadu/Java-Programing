import java.util.*;

public class piarray {
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
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")");

            }
            System.out.println();

        }
    }
}