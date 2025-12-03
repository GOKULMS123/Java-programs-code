// Sorted map.
// Uses a Red-Black Tree → operations O(log n).
// Features..
// Sorted by key
// No null key allowed
// Useful for navigational operations like ceiling/floor.

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(30, "Thirty");
        tm.put(10, "Ten");
        tm.put(20, "Twenty");

        System.out.println(tm);  // sorted: {10=Ten, 20=Twenty, 30=Thirty}

        // Access
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.ceilingKey(15));
        System.out.println(tm.floorKey(25));

        // Remove
        tm.remove(20);

        // Iterate
        for (Integer key : tm.keySet()) {
            System.out.println(key + " => " + tm.get(key));
        }
    }
}
