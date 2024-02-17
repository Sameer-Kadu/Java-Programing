import java.util.*;

public class sc {
    public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a[] = new int [10];
            
            int k = Integer.MIN_VALUE;
            int d= 0;
            for(int i = 0 ;i<a.length;i++)
            {
                a[i] = sc.nextInt();

            }
            for(int w = 0 ;w<a.length;w++)
        {
           
            if(k < a[w])
            {
                k = a[w];
            }
        }
        int c[] = new int [k+1];

            for(int s = 0 ; s<c.length;s++)
            {
            for(int j = 0;j<a.length;j++){
                if(s == a[j])
                {
                    d++;
                }
            }
            c[s] = d;
            d = 0;
        }
        // for(int p = 0;p<c.length;p++)
        //  {
        //      System.out.println(c[p]);
        //  }
    
        int n = 0;
       
        for(int l = 0;l<c.length;l++)
        {
            if(c[l]>0)
            {
                for(int x = 0;x<c[l];x++)
                {
                    a[n]= l;
                    n++;
                }
            }
            else
            {
                continue;
            }
        }
        for(int p = 0;p<a.length;p++)
        {
            System.out.println(a[p]);
        }
        

            sc.close();
         }
}