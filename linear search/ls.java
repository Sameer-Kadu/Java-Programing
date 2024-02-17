import java.util.*;

public class ls {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int c = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (c == a[i]) {
                System.out.println(i);
                break;
            } else {
                continue;
            }
        }

        sc.close();
    }
}