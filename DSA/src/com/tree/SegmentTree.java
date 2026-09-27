package DSA.src.com.tree;

public class SegmentTree {
    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            // leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // create new node with you are at

        Node node = new Node(start, end);

        int mid = (start + end) / 2;
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null) return;

        String str = "";
        str += "Node Interval = [" + node.startInterval + "-" + node.endInterval + "]";
        str += " Data = " + node.data;

        if (node.left != null)
            str += " | Left = [" + node.left.startInterval + "-" + node.left.endInterval + "]";
        else
            str += " | Left = null";

        if (node.right != null)
            str += " | Right = [" + node.right.startInterval + "-" + node.right.endInterval + "]";
        else
            str += " | Right = null";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }


    //query
    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            // node completely lying inside the query
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            // completely outside
            return 0;
        } else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }

    }

    public void update(int index, int value) {
        root.data = update(root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
