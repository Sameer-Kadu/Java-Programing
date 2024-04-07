import java.util.*;
public class fudp {
    public static int fibonacci(int n, int way[])
    {
        if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        if(way[n]!= -1){
            return way[n];
        }
        way[n]=fibonacci(n-1,way)+fibonacci(n-2,way);
        return way[n];
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[]=new int[a+1];
        Arrays.fill(b, -1);
        System.out.println("F(" + a + ") = " + fibonacci(a,b));
    }
}