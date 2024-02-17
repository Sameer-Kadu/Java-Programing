import java.util.*;
public class rn 
{
    public static void main (String args[])
    {
        int s ,c=0 ;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a > 0)
        {
            s = a % 10;
            a = a / 10;
            c = (c * 10) + s;
        }
        System.out.println(c);
        sc.close();
    }
}