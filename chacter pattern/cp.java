import java.util.*;
public class cp
{
    public static void cp1 ()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = 'A';
        for ( int i=0 ;i<a;i++)
        {
            for (int j =0 ;j<=i;j++)
            {
                System.out.print(b);
                b++;
            }
           
            System.out.print("\n");

        }
        sc.close();
    }
    public static void main(String args[])
    {
        cp1();
    }
}