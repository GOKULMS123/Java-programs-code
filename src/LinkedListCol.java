import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListCol {
    public static void main(String[] args) {

        // Create LinkedList -- Node
        // faster insert and remove
        // slow random search...
        LinkedList<String> list = new LinkedList<>();

        // -------- Add Methods --------
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.addFirst("Mango");       // add at start
        list.addLast("Pineapple");    // add at end

        list.add(2, "Grapes");        // add at index

        // -------- Access Methods --------
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));

        // -------- Update Method --------
        list.set(1, "Kiwi");          // update by index

        // -------- Remove Methods --------
        list.remove();                // remove first element
        list.remove("Orange");        // remove by value
        list.remove(2);               // remove by index
        list.removeFirst();           // remove first
        list.removeLast();            // remove last

        // -------- Check Methods --------
        System.out.println("Contains Kiwi? " + list.contains("Kiwi"));
        System.out.println("Index of Grapes: " + list.indexOf("Grapes"));
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());

        // -------- Iteration Methods --------
        System.out.println("\nUsing for-each:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // -------- Stack/Queue Behavior --------
        list.push("Watermelon");      // push to front
        list.offer("Papaya");         // add to end
        list.poll();                  // remove first

        System.out.println("\nFinal List: " + list);

        // -------- Clear --------
        list.clear();
        System.out.println("After clear: " + list);
    }
}
