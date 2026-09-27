package DSA.src.com.linklist;

public class Main {
    static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(35);
        list.insertFirst(65);
        list.insertFirst(45);
        list.insertFirst(37);
        list.insertFirst(3);
        list.insertLast(55);
        list.insert(100, 2);
//        list.display();
//        System.out.println(list.delete(2));
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteFirst());
//        list.insertRec(2,3);
         list.display();
         list.reverse(list.get(0));
         list.display();
    }
}
