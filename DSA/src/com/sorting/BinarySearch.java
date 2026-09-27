package DSA.src.com.sorting;

public class BinarySearch {

	public static int binarysearch(int num[], int key) {

		int start = 0, end = num.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (num[mid] == key) {
				return mid;
			}
			if (num[mid] < mid) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int number[] = { 1, 3, 5, 7, 9 };
		int key = 5;
		System.out.println(binarysearch(number, key));

	}
}
