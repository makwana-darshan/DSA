package DSA.src.com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {10,30,20,10,50,20};
        int[] arr = bubbleSort(num);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {//
                break;
            }
        }
        return arr;
    }
}
