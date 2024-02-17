import java.util.*;
public class leap
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0)
        {
            if (a % 100 == 0) 
            {
                if(a % 400 == 0)
                {
                    System.out.println("LEAP YEAR");
                }
                else
                {
                    System.out.println("NOT A LEAP YEAR");
                }
            }
            else
            {
                System.out.println("LEAP YEAR");
            }
        }
        else
        {
            System.out.println("NOT A LEAP YEAR");
        }
        sc.close();
    }
}