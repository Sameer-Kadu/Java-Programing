
import java.util.*;

public class dps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int s = 1; s <= (2 * i - 1); s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = a; i >= 1; i--) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int s = 1; s <= (2 * i - 1); s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}