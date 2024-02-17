
import java.util.*;

public class btd {
    public static void binarytodecimal() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = 0;
        int i = 0;
        while (a > 0) {

            int r = a % 10;

            d = (d + (r * (int) Math.pow(2, i)));
            i++;
            a = a / 10;

        }
        System.out.println(d);
        sc.close();
    }

    public static void main(String args[]) {
        binarytodecimal();
    }
}