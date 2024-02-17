import java.util.*;

public class qsr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        sortArray(a, 0, 4);
        printarray(a);
    }

    public static void printarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return;
    }

public static void sortArray(int a[], int s, int e)
{
    if(s >= e)
    {
        return;
    }
    int mid = s + (e-s)/2;
    sortArray(a, s, mid);
    sortArray(a, mid+1, e);
    merg(a, s, e, mid);
}

    public static void merg(int a[], int s, int e, int m) {
        int k[] = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int b = 0;
        while ((i <= m) && (j <= e)) {
            if (a[i] < a[j]) {
                k[b] = a[i];
                i++;
            } else {
                k[b] = a[j];
                j++;
            }
            b++;
        }
        while (i <= m) {
            k[b] = a[i];
            i++;
            b++;
        }
        while (j <= e) {
            k[b] = a[j];
            b++;
            j++;
        }
        for (b = 0, i=s; b < k.length; b++,i++) {
            a[i] = k[b];
            System.out.print(k[b]+" ");
            
        }
        System.out.println();
        
    }
}