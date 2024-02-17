import java.util.*;
public class btf
{
    public static void main ( String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if (a > 100) 
        {
          System.out.println("You have feaver");  
        } 
        else 
        {
           System.out.println("You dont have feaver"); 
        }
        sc.close();
    }
}