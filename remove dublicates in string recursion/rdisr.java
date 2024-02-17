import java.util.*;
public class rdisr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        MainString(c, 0, new boolean [26], new StringBuilder(""));
    }
    public static void MainString(String c, int i, boolean m[], StringBuilder b)
    {
        if(i == c.length())
        {
            System.out.print(b);
            return;
        }
        int s = c.charAt(i)-'a';
        if(m[s]==true)
        {
            MainString(c, i+1, m, b);
        }
        else
        {
            m[s]=true;
            MainString(c, i+1, m, b.append(c.charAt(i)));
        }
    }
}