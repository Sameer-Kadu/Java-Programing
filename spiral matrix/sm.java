import java.util.*;

public class sm {
    public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            int a[][] = new int [3][4];
            for(int i = 0 ;i<a.length;i++)
            {
                for(int j = 0 ;j<a[0].length;j++)
                {
                    a [i][j]= sc.nextInt();
                }
            }
            spiralmatrix(a);

            sc.close();
         }

    public static void spiralmatrix(int a[][])
    {
       int sr=0;
        int sc=0;
        int er=a.length-1;
        int ec=a[0].length-1;
        while (sr <= er & sc<=ec)
        {
       for(int j = sc;j<=ec;j++ )
       {
        System.out.print(a[sr][j]+" ");
        
       }
       for (int i=sr+1;i<=er;i++)
       {
        System.out.print(a[i][ec]+" ");
        
       }
       for(int j=ec-1 ; j >=sc ;j--)
       {
        if(sr==er)
        {
            break;
        }
        System.out.print(a[er][j]+" ");
        
       }
       for (int i=er-1; i>=sr+1 ;i--)
       {
         if(sc==ec)
        {
            break;
        }
            System.out.print(a[i][sc]+" ");
            
       }
       sr++;
       sc++;
       er--;
       ec--;
    }
    }
}