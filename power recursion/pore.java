import java.util.*;
public class pore
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int p = sc.nextInt();
           System.out.println(power(a,p));
            
            sc.close();
         }
         public static int power(int a, int p)
         {
            if(p==2)
            {
                return a*a;
            }
            return a*power(a, p-1);
         }
}