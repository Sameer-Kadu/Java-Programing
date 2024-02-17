import java.util.*;
public class nfr
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println(fibonacci(a));
            
            sc.close();
         }
         public static int fibonacci(int a)
         {
            if (a == 0 || a==1)
            {
                return 1;
            }
            
            return fibonacci(a-1)+fibonacci(a-2);
         }
}