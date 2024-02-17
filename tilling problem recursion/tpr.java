import java.util.*;
public class tpr{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(tailling(a));
        
    }
    public static int tailling(int a)
    {
        if(a==0 || a== 1)
        {
            return 1;
        }
        return tailling(a-1)+tailling(a-2);
    }

}