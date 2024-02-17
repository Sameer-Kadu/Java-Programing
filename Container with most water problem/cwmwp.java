import java.util.*;

public class cwmwp {

    public static int BigContainer(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;
        int maxArea = Integer.MIN_VALUE;

        while (left < right) {
            int area = 0;
            if (list.get(left) < list.get(right)) {
                area = list.get(left) * (right - left);
                left++;
            } else {
                area = list.get(right) * (right - left);
                right--;
            }
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int maxArea = BigContainer(list);
        System.out.println("Maximum area: " + maxArea);
    }
}