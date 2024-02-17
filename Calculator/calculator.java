import java.util.*;
public class calculator
{
    public static void main (String args[])
    {
        int r=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        switch (c) 
        {
            case '+':
                      r = a + b;
                     break;
            case '-':
                     r = a - b;
                     break;
            case '*':
                     r = a * b;
                     break;
            case '/':
                     r = a / b;
                     break;
             default:
                break;
        }
        
        System.out.println(r);
        sc.close();


    }
}