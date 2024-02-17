import java.util.*;

public class bs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("enter a number you want to search");
        int s = sc.nextInt();
        int start = 0;
        int end = a.length;

        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (a[mid] == s) {
                System.out.println(mid);
                break;

            } else if (a[mid] < s) {
                start = mid;
            } else {
                end = mid;
            }
        }

        sc.close();
    }
}