import java.util.ArrayList;
import java.util.List;

public class Comparater {
    
    public static void main(String[] args) {
        List l1=new ArrayList<>();
        l1.add(1);
        l1.add(5);
        l1.add(4);
        l1.add(3);
        
        System.out.println(l1);
        l1.sort(null);
        System.out.println(l1);
    }
}
