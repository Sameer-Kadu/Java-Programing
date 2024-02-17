import java.util.Scanner;
import java.util.*;

public class qsrp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }

    public static void quickSort(int a[], int s, int e) {
        if (s >= e) {
            return;
        }
        int piv = partition(a, s, e);
        quickSort(a, s, piv - 1);
        quickSort(a, piv + 1, e);
    }

    public static int partition(int a[], int s, int e) {
        int p = a[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (a[j] < p) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, ++i, e);
        return i;
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}