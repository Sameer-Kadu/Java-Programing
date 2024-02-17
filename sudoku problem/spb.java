import java.util.*;

public class spb {
    public static boolean isSafe(int su[][], int row, int col, int d) {
        for (int i = 0; i < 9; i++) {
            if (su[i][col] == d) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (su[row][i] == d) {
                return false;
            }
        }
        int newRow = (row / 3) * 3;
        int newCol = (col / 3) * 3;
        for (int i = newRow; i < newRow + 3; i++) {
            for (int j = newCol; j < newCol + 3; j++) {
                if (su[i][j] == d) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void printsudoku(int su[][])
    {
        for ( int i = 0; i<9 ; i++ )
            {
                for(int j=0;j<9;j++)
                {
                    System.out.print(su[i][j]+" ");
                    
                }
                System.out.println();
            }

    }

    public static boolean sudokuSol(int su[][], int row, int col) {
        if (row == 9 && col == 0) {
            printsudoku(su);
            return true;
        }

        int newR = row, newC = col + 1;
        if (newC == 9) {
            newR = row + 1;
            newC = 0;
        }
        if (su[row][col] != 0) {
            return sudokuSol(su, newR, newC);
        }
        for (int d = 1; d <= 9; d++) {
            if (isSafe(su, row, col, d)) {
                su[row][col] = d;
                if (sudokuSol(su, newR, newC)) {
                    return true;
                }
                su[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        System.out.println(sudokuSol(sudoku, 0, 0));
        
    }
}
