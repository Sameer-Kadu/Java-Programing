import java.util.*;
public class spattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        for ( int i =1;i<=a;i++)
        {
            for ( int j = 1;j<=a;j++)
            {
                if ( i == 1 || i == a || j==1 || j== a)
                {
                    System.out.print('*');
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            System.out.print("\n");
        }
        sc.close();
    }
}