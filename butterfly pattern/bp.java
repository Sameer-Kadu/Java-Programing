import java.util.*;
public class bp
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for ( int i =1;i<=a;i++)
        {
            for ( int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            for ( int s =1;s<=2*(a-i);s++)
            {
                System.out.print(" ");
            }
            for ( int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int i =a;i>0;i--)
        {
            for ( int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            for ( int s =1;s<=2*(a-i);s++)
            {
                System.out.print(" ");
            }
            for ( int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}