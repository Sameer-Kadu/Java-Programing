import java.util.*;
public class posb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subString(str, new String(" "));
}
public static void subString(String str, String as)
{
    if(str.length()==0)
    {
        System.out.println(as);
        return;
        
    }
    for(int i=0;i<str.length();i++)
    {
        char curr = str.charAt(i);
        String newStr = str.substring(0,i)+str.substring(i+1,str.length());
        subString(newStr, as+curr);
    }
}
}