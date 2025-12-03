/* unordered array means that it's not maintain the same what we have inserted
It sorted -- not allows the duplicates -- */
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // -------- Add --------
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");    // ignored (duplicate)

        // -------- Basic checks --------
        System.out.println("Contains Banana? " + set.contains("Banana"));
        System.out.println("Is empty? " + set.isEmpty());
        System.out.println("Size: " + set.size());

        // -------- Remove --------
        set.remove("Orange");

        // -------- Iteration --------
        System.out.println("\nUsing for-each:");
        for (String item : set) {
            System.out.println(item);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // -------- Convert to array --------
        Object[] arr = set.toArray();

        // -------- Clear --------
        set.clear();
    }
}
