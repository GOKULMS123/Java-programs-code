import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        // Create ArrayList--dynamic array ...  
        List<String> list = new ArrayList<>();

        // -------- Add Methods --------
        list.add("Apple");                // add element
        list.add("Banana");
        list.add("Orange");

        list.add(1, "Mango");             // add at index

        // -------- Access Methods --------
        System.out.println("Element at index 2: " + list.get(2));

        // -------- Update Method --------
        list.set(2, "Grapes");            // replace element

        // -------- Remove Methods --------
        list.remove("Banana");            // remove by value
        list.remove(0);                   // remove by index

        // -------- Check Methods --------
        System.out.println("Contains Mango? " + list.contains("Mango"));
        System.out.println("Index of Grapes: " + list.indexOf("Grapes"));
        System.out.println("Is list empty? " + list.isEmpty());
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

        // -------- Sorting --------
        list.add("Pineapple");
        list.add("Kiwi");
        Collections.sort(list);
        System.out.println("\nSorted List: " + list);

        // -------- Converting to Array --------
        Object[] arr = list.toArray();
        System.out.println("Array length: " + arr.length);

        // -------- Clear --------
        list.clear();
        System.out.println("List after clear(): " + list);
    }
}
