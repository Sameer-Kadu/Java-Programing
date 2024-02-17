import java.util.*;

public class gwb {
    public static int gridWays(int a[][],int row, int col)
    {
        if (row == a.length-1 && col == a.length-1) 
        {
            return 1;
        }    
        if(row == a.length || col == a.length)
        {
            return 0;
        }
        return gridWays(a, row+1, col)+gridWays(a, row, col+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int c = gridWays(a, 0, 0);
        System.out.println(c);
        
    }
}