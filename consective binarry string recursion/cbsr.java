import java.util.*;
public class cbsr {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        consectiveBinnary(a, new String(""), 0);
    }
    public static void consectiveBinnary(int a, String c, int last)
    {
        if( a == 0)
        {
            System.out.println(c); 
            return;
        }
        consectiveBinnary(a-1, c+'0',0);
        if(last == 0)
        {
            consectiveBinnary(a-1, c+'1', 1);
        }
    }
}