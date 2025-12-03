// Key-value pairs
// Maintains insertion order
// Performance: almost HashMap
// Allows null key + values

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("A", 10);
        lhm.put("C", 30);
        lhm.put("B", 20);

        System.out.println(lhm);  // {A=10, C=30, B=20}

        // Iterate
        for (String key : lhm.keySet()) {
            System.out.println(key + " => " + lhm.get(key));
        }

        // Remove, contains...
        lhm.remove("C");
        System.out.println(lhm.containsKey("B"));
    }
}
