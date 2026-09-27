package DSA.src.com.tree;

public class AVLMain {
    static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 500; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}
