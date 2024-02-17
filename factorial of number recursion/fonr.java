import java.util.*;
public class fonr {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));
    }
    public static int factorial (int a)
    {
        if(a == 0)
        {
            return 1;
        }
        return a*factorial(a-1);
        
    }
}