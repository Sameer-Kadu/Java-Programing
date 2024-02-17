
import java.util.*;

public class nqb {
    public static boolean isSafe(char a[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (a[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (a[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < a.length; i--, j++) {
            if (a[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void horiMax(char a[][], int row) {
        if (row == a.length) {
            printBoard(a);
            System.out.println("-----Chess Board-----");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (isSafe(a, row, i)) {
                a[row][i] = 'Q';
                horiMax(a, row + 1);
                a[row][i] = 'X';
            }
        }
    }

    public static void printBoard(char a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a[][] = new char[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 'X';

            }
        }
        horiMax(a, 0);
        sc.close();
    }
}