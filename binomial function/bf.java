import java.util.*;

public class bf {
    public static int factorial(int a) {

        int r = 1;
        for (int i = 1; i <= a; i++) {
            r = r * i;
        }

        return r;
    }

    public static void bionimal() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int b = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(b);
        sc.close();

    }

    public static void main(String args[]) {
        bionimal();
    }

}