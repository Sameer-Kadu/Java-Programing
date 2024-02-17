import java.util.*;

public class mc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.next();
        }
        System.out.println("what do you want to eat ");
        String c = sc.next();
        for (int i = 0; i < 5; i++) {
            if (c.equals(a[i])) {
                System.out.println(i);
                break;
            } else {
                // System.out.println(c);

                continue;
                math.power();
            }
        }

        sc.close();
    }
}