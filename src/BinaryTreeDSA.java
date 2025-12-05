import java.util.LinkedList;
import java.util.Queue;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data = data;
        left = null; 
        right = null;
    }
}
class binaryTree {
    node root;
    // Traversal: Inorder (Left → Root → Right)
    public void inorder(node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Traversal: Preorder (Root → Left → Right)
    public void preorder(node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Traversal: Postorder (Left → Right → Root)
    public void postorder(node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal (BFS)
    public void levelOrder(node root) {
        if (root == null) return;

        Queue<node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }
    // Insert into Binary Tree using Level Order
    public void insert(int value) {
        node newNode = new node(value);

        // If tree is empty
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            node curr = q.poll();

            // Check left
            if (curr.left == null) {
                curr.left = newNode;
                break;
            } else {
                q.add(curr.left);
            }

            // Check right
            if (curr.right == null) {
                curr.right = newNode;
                break;
            } else {
                q.add(curr.right);
            }
        }
    }
    // Count total nodes
    public int countNodes(node root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Height of tree
    public int height(node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Search a value in binary tree
    public boolean search(node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        return search(root.left, key) || search(root.right, key);
    }

}
public class BinaryTreeDSA{
    public static void main(String[] args) {
        // node root;
        binaryTree tree = new binaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        tree.insert(80);
        tree.insert(90);
        System.out.println("Inorder");
        tree.inorder(tree.root);
        System.out.println("\nPre-order");
        tree.preorder(tree.root);
        System.out.println("\nPost-order");
        tree.postorder(tree.root);
        System.out.println("\nLevel-order");
        tree.levelOrder(tree.root);

        System.out.println("\nTotal Nodes: " + tree.countNodes(tree.root));
        System.out.println("Height of Tree: " + tree.height(tree.root));
        System.out.println("Search 5: " + tree.search(tree.root, 50));  // true
        System.out.println("Search 100: " + tree.search(tree.root, 100));  // false

    }
}
