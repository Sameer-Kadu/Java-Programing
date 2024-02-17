import java.util.*;

public class scom {
    public static String StringCompression(String s)
    {
        StringBuilder sa = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1))
            {
                count++;
                i++;
            }
            sa.append(s.charAt(i));
            if(count > 1)
            {
                sa.append(count.toString());
            }
        }
        return sa.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(StringCompression(s));

        sc.close();
    }
}