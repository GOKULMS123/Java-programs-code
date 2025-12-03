import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Adding
        queue.add("A");
        queue.add("B");
        queue.offer("C");

        // Peeking
        System.out.println("Front element: " + queue.peek());

        // Removing
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.remove());

        // Checking
        System.out.println("Front now: " + queue.peek());
        System.out.println("Is empty? " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}
