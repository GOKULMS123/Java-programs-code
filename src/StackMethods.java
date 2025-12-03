import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {

        // Create Stack
        Stack<String> stack = new Stack<>();

        // -------- Push (add on top) --------
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // -------- Peek (just see top) --------
        System.out.println("Top element: " + stack.peek());

        // -------- Pop (remove top) --------
        System.out.println("Popped: " + stack.pop());

        // -------- Search (1-based index from top) --------
        System.out.println("Position of 'Apple': " + stack.search("Apple"));

        // -------- Check Methods --------
        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());

        // -------- Iteration --------
        System.out.println("\nStack elements:");
        for (String item : stack) {
            System.out.println(item);
        }

        // -------- Clear --------
        stack.clear();
        System.out.println("\nAfter clear: " + stack);
    }
}
