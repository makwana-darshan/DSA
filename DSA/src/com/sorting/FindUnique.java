package DSA.src.com.sorting;

public class FindUnique {
    static int unique(int[] arr){
        int uniNumber=0;
        for(int x:arr){

            uniNumber ^= x;
        }
        return uniNumber;
    }
    static void main(String[] args) {
        int[] arr={2,5,3,2,6,3,5};
        System.out.println(unique(arr));
    }
}
