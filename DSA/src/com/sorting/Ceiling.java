package DSA.src.com.sorting;


public class Ceiling {
    public static void main(String[] args) {
        int[] number = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int res = ceiling(number, target);
        System.out.println(number[res]);
    }

    // return the index of smallest no >= target
    public static int ceiling(int num[], int target) {

        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
