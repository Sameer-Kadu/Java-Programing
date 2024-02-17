import java.util.*;
public class sums
{
    // Sum of two number by taking the inpute from user
    public static void main(String srgs[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.close();
    }
}