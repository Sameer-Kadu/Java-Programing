import java.util.*;
public class snn 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int r = 0;
        while (i <= a)
        {
        
            r = r + i;
            i++;
        }
        System.out.println(r);
        sc.close();

    }
}