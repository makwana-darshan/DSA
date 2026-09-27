package DSA.src.com.practice.recursion;

import java.lang.classfile.attribute.ModuleProvideInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        number(1000);

    }
    static void number(int n){
        if (n<=0){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
    public static long countZeroSumSubarrays(List<Integer> arr) {
        Map<Long,Long> map=new HashMap<>();

        long sum =0;
        long count=0;


        map.put(0L,1L);


        for(int num : arr){
            sum+=num;
            if(map.containsKey(sum)){
                count +=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0L)+1);
        }


        return count;
    }
}
