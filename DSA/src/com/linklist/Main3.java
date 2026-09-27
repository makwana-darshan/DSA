package DSA.src.com.linklist;

public class Main3 {
    static void main(String[] args) {
        CLL list=new CLL();
        list.insert(45);
        list.insert(23);
        list.insert(85);
        list.insert(65);
        list.display();
        list.delete(500);
        list.display();
    }
}
