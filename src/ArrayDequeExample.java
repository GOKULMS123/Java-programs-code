/*---- Double-Ended Queue -------- resizable array -------*/
// insertion and deletion are done at both ends .......
// faster than Linkedlist and stack ----
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<String> dq = new ArrayDeque<>();

        // ---------- Add ----------
        dq.add("A");           // add at tail
        dq.addFirst("B");      // add at head
        dq.addLast("C");       // add at tail
        dq.offer("D");         // safe add tail
        dq.offerFirst("E");    // safe add head
        dq.offerLast("F");     // safe add tail

        // ---------- Access ----------
        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());
        System.out.println("Peek: " + dq.peek());          // front
        System.out.println("PeekLast: " + dq.peekLast());  // back

        // ---------- Remove ----------
        System.out.println("Removed: " + dq.remove());       // front
        System.out.println("Removed First: " + dq.removeFirst());
        System.out.println("Removed Last: " + dq.removeLast());

        // Safe remove
        dq.poll();         // returns null if empty
        dq.pollFirst();
        dq.pollLast();

        // ---------- Stack Behavior ----------
        dq.push("X");      // push to top
        dq.push("Y");
        System.out.println("Popped: " + dq.pop()); // remove top

        // ---------- Check ----------
        System.out.println("Contains X? " + dq.contains("X"));
        System.out.println("Size: " + dq.size());
        System.out.println("Is empty? " + dq.isEmpty());

        // ---------- Clear ----------
        dq.clear();
    }
}
