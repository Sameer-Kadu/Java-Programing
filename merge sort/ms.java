import java.util.*;

public class ms {
    public static void divide(String a, int si, int ei) {
        
        
        if(si >= ei)
        {
            return;
        }
        int mid = si + (ei-si)/2;
        divide(a, si, mid);
        divide(a, mid+1, ei);
    }
    public static void merge()
    {
        
    }

    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String a = sc.nextLine();
    divide(a,0,a.length());

    sc.close();
    }
}