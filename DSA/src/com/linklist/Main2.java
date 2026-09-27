package DSA.src.com.linklist;

public class Main2 {
    static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(35);
        list.insertFirst(65);
        list.insertFirst(45);
        list.insertFirst(37);
        list.insertFirst(3);
        list.insert(65,2);
        list.display();
    }
}
