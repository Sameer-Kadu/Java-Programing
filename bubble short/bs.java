import java.util.*;

public class bs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        boolean sb = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < (a.length - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    sb = false;
                }
            }
            if (sb == true) {
                break;
            }

        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }
        sc.close();
    }
}