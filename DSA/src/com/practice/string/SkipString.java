package DSA.src.com.practice.string;

public class SkipString {
    static void main(String[] args) {
        String s =  "agsapple";
        System.out.println(skip(s));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return  skip(up.substring(5));
        }else {
            return up.charAt(0)+skip(up.substring(1));
        }
    }
}
