import java.util.*;
public class sosb {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        subset(str,new String(" "),0);
    }
    public static void subset(String str, String an, int i)
    {
        if(i==str.length())
        {
            System.out.println(an);
            return;
        }
        subset(str,an+str.charAt(i),i+1);
        subset(str,an,i+1);
    }
}