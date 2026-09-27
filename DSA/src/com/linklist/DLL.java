package DSA.src.com.linklist;

public class DLL {
    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value, Node prev) {
            this.next = next;
            this.value = value;
            this.prev = prev;
        }
    }

    Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int value) {
        Node p = find(after);
        if (p == null) {
            System.out.println("element is not exist..!");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
}








