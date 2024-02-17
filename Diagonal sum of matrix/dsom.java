import java.util.*;

public class dsom {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        diagonalsum(a);

        sc.close();
    }

    public static void diagonalsum(int a[][]) {
        int s = 0;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         if (i == j) {
        //             s = s + a[i][j];
        //         } else if (i + j == a.length - 1) {
        //             if (i != j) {
        //                 s = s + a[i][j];
        //             }
        //         }
        //     }
        // }
        for (int i = 0;i<a.length;i++)
        {
            s+=a[i][i];
            if(i != a.length-1-i)
            {
                s+=a[i][a.length-1-i];
            }
        }

        System.out.println(s);

    }
}
