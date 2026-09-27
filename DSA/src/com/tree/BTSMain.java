package DSA.src.com.tree;

public class BTSMain {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BST bst = new BST();
        bst.populatedSorted(nums);
//        bst.display();
//        System.out.println(bst.balanced());
        bst.inOrder();
        System.out.println();
        bst.preOrder();
        System.out.println();
        bst.postOrder();
    }
}
