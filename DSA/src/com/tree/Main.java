package DSA.src.com.tree;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        bt.populate(scanner);
        bt.display();
    }
}
