import java.util.*;
public class hp
{
    public static void hp1 ()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0;i<=a;i++)
        {
            for ( int j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.print("\n");

        }
        sc.close();
    }

    public static void main ( String args[])
    {
        hp1();
    }


}