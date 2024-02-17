import java.util.*;

public class sarasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        int si = 0;
        int ei = a.length;
        for (int j = si; j < ei; j++) {
            int mid = si + (ei - si) / 2;
            if (a[0] == tar) {
                System.out.println(0);
                break;
            }
            if (a[mid] == tar) {
                System.out.println(mid);
                break;
            }
            if (a[mid] >= a[si]) {
                if (a[si] <= tar && a[mid] >= tar) {
                    ei = mid;
                } else {
                    si = mid + 1;
                }
            } else {
                if (a[ei] >= tar && a[mid] <= tar) {
                    si = mid;
                } else {
                    ei = mid - 1;
                }
            }

        }
    }
}
