// import java.util.*;
// public class ipnp
// {
//     public static void rsp1 ()
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for ( int i=0 ;i<a;i++)
//         {
//             for ( int j=1;j<=(a-i);j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.print("\n");
//         }
//         sc.close();

//     }
//     public static void main (String args[])
//     {
//         rsp1();
//     }
// }
import java.util.*;

public class ipnp {
    public static void rsp1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            sb.append(i);
        }

        for (int i = 0; i < a; i++) {
            System.out.println(sb.substring(0, a - i));
        }

        sc.close();
    }

    public static void main(String args[]) {
        rsp1();
    }
}
