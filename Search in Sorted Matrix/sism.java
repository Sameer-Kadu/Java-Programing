import java.util.*;

public class sism {
    public static void main (String args[])
         {
           Scanner sc = new Scanner(System.in);

             int a[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
             int n = sc.nextInt();
             
           searchmatrix(a,n);
           sc.close();
          
         }

    public static boolean searchmatrix(int a[][], int n) {

        int i = 0, j = a[0].length - 1;
        while (i < a.length && j >= 0) {
            if (a[i][j] == n) {
                System.out.println("the number is at index i=" + i + " and j=" + j);
                return true;
            } else if (a[i][j] > n) {

                j--;
            } else if (a[i][j] < n) {
                i++;

            }
        }
        return false;

    }
}