import java.util.*;
public class rsp
{
    public static void rsp1 ()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for ( int i=a ;i>0;i--)
        {
            for ( int j=0;j<i;j++)
            {
                System.out.print('*');
            }
            System.out.print("\n");
        }
        sc.close();

    }
    public static void main (String args[])
    {
        rsp1();
    }
}