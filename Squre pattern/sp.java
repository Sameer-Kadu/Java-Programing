import java.util.*;
public class sp
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for ( int i = 0;i < a;i++)
        {
            for (int j = 0;j < a;j++)
            {
                System.out.print('*');
            }
            System.out.print("\n");
        }
        sc.close();
    }
}