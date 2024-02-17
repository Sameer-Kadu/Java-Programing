import java.util.*;
public class nnm
{
    public static void main ( String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        while (true) 
        {
            int a = sc.nextInt();
            if (a % 10 == 0)
            {
                break;
            }
            else 
            {
                System.out.println(a);
              
            }
        }
        sc.close();
    }
}