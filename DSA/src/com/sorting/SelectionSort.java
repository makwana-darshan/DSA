package DSA.src.com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIngex = getMaxIndex(arr, 0, last);
            swap(arr, maxIngex, last);
        }

    }

    public static void swap(int[] arr, int start, int second) {
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
