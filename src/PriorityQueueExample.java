import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        //Collections.reverseOrder() => MaxHeap --> perform to store in reverse order.....
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // minHeap --> Natural Order....

        // Adding elements
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        // Queue prints unordered
        System.out.println("PriorityQueue: " + pq);

        // Removing gives smallest first
        System.out.println("Removed: " + pq.poll()); // 10
        System.out.println("Removed: " + pq.poll()); // 20

        System.out.println("Peek: " + pq.peek());   // 30

        System.out.println("Size: " + pq.size());
    }
}
