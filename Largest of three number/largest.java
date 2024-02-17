import java.util.*;
public class largest
{
    public static void main (String args[])
    {
        int x;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a > b && a > c)
        {
            x=a;
        }
        else if ( b > c && b > a)
        {
            x = b;
        }
        else 
        {
            x = c;
        }
        System.out.println(x);
        sc.close();
    }
    
}