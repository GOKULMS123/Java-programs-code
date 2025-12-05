
import java.util.*;

// Node structure for BST
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// BST class with all operations
class BST {
    Node root;

    // INSERT
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else
            root.right = insertRec(root.right, data);

        return root;
    }

    // SEARCH
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        return key < root.data
                ? searchRec(root.left, key)
                : searchRec(root.right, key);
    }

    // INORDER (Left → Root → Right)
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root == null) return;

        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }

    // PREORDER (Root → Left → Right)
    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorderRec(root.left);
        preorderRec(root.right);
    }

    // POSTORDER (Left → Right → Root)
    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(Node root) {
        if (root == null) return;

        postorderRec(root.left);
        postorderRec(root.right);
        System.out.print(root.data + " ");
    }

    // LEVEL ORDER (BFS)
    public void levelOrder() {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }
}

// MAIN PROGRAM
public class BinarySearchTree {
    public static void main(String[] args) {

        BST tree = new BST();

        // Insert values
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        System.out.println("Inorder Traversal:");
        tree.inorder();

        System.out.println("\nPreorder Traversal:");
        tree.preorder();

        System.out.println("\nPostorder Traversal:");
        tree.postorder();

        System.out.println("\nLevel Order Traversal:");
        tree.levelOrder();

        System.out.println("\nSearch 7: " + tree.search(7));     // true
        System.out.println("Search 100: " + tree.search(100));   // false
    }
}
