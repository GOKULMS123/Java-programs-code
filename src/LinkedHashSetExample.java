/*  --  It combines the functionalities of a HashSet with a doubly-linked list to 
        maintain the insertion order of elements.
    --  LinkedHashSet stores unique elements only and allows a single null.
    --  Implements Set, Cloneable and Serializable interfaces. */
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        // -------- Add (keeps order) --------
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");   // duplicate ignored

        // -------- Basic checks --------
        System.out.println("Contains B? " + set.contains("B"));
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        // -------- Remove --------
        set.remove("B");

        // -------- Enhanced for-loop --------
        System.out.println("\nUsing for-each:");
        for (String item : set) {
            System.out.println(item);
        }

        // -------- Iterator --------
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // -------- Convert to array --------
        Object[] arr = set.toArray();

        // -------- Clear --------
        set.clear();
        System.out.println("After clear: " + set);
    }
}
