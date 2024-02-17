import java.util.*;
public class tpat

{
    public static void main ( String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for ( int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if ((j+i)%2 == 0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }
}