import java.util.*;

public class pon1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                b = 0;
                break;

            } else {
                b = 1;

            }
        }
        if (b == 0) {
            System.out.println("NUMBER IS NOT PRIME");
        } else {
            System.out.println("NUMBER IS PRIME");
        }

        sc.close();
    }

}