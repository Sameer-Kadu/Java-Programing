import java.util.*;
public class pon
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if ( a < 0)
    {
        System.out.println("Number is negitive");
    }
    else
    {
        System.out.println("Number is positive");
    }
    sc.close();
    }
}