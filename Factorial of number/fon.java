import java.util.*;
public class fon
{
    public static void main ( String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = 1;
        for ( int i = 1; i <= a ; i++)
        {
            r = r * i;
        }
        System.out.println(r);
        sc.close();
    }
}