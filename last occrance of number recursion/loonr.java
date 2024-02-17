import java.util.*;
public class loonr
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a[] = new int[5];
            for(int i =0;i<a.length;i++)
            {
                a[i]= sc.nextInt();
            }
            int k = sc.nextInt();
            int y=a.length-1;
            System.out.println(lastocc(a,k,y));
            sc.close();
         }
         public static int lastocc(int a[],int k,int y){
            if(y == 0)
            {
                return -1;
            }
            if(a[y]==k)
            {
                return y;
            }
            return lastocc(a, k, y-1);
}
}