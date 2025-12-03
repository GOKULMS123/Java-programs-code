/* It stores elements in key-value pairs, 
where Keys are unique. and Values can be duplicated. 

A key only holds one value, and if you give a new value 
to the same key, the old value is overwritten.*/
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Add
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(2, "Berry");  // replaces existing

        // Access
        System.out.println(map.get(2));     // Berry
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Apple"));

        // Remove
        map.remove(1);

        // Iterate
        for (Integer key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        // Size
        System.out.println(map.size());

        // Clear
        map.clear();
    }
}
