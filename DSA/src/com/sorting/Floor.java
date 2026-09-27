package DSA.src.com.sorting;

public class Floor {

    public static void main(String[] args) {
        int[] number = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int res = floor(number, target);
        System.out.println(number[res]);
    }

    // return the index of greatest number <= target
    public static int floor(int[] num, int target) {

        // if target is smaller than the smallest element
        if (target < num[0]) {
            return -1;
        }

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
        return end; // floor index
    }
}
