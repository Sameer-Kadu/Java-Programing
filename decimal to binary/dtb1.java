import java.util.*;
public class dtb1
{
    public static void decimaltobinary()
    {
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = 0, i=0;
        while ( a > 0)
        {
            b = b + ((a%2)* (int)Math.pow(10, i));
            a = a/2;
            i++;
        }
        System.out.println(b);
        sc.close();
    }
    public static void main (String args[])
    {

        decimaltobinary();
    }
}