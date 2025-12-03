/*  ->Java TreeSet class implements the Set interface that uses a tree for storage. 
    ->Like HashSet, TreeSet also contains unique elements. However, 
    the access and retrieval time of TreeSet is quite fast. 
    ->The elements in TreeSet stored in ascending order.
    -> Uses Self Balancing tree[red black tree] to store the sorted array..
 */
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        // ------- Add -------
        ts.add(50);
        ts.add(10);
        ts.add(40);
        ts.add(20);
        ts.add(10);   // ignored

        // ------- Basic checks -------
        System.out.println("TreeSet: " + ts);      // sorted
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());
        System.out.println("Contains 20? " + ts.contains(20));
        System.out.println("Size: " + ts.size());

        // ------- Remove -------
        ts.remove(40);

        // ------- Iterator -------
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ------- Head/Tail/Sub Sets -------
        System.out.println("Head (<30): " + ts.headSet(30));
        System.out.println("Tail (>=20): " + ts.tailSet(20));
        System.out.println("SubSet (10 to 50): " + ts.subSet(10, 50));
        
        // ---------- for integers only ----------- //
        // System.out.println("Lower: "+ts.lower());
        // System.err.println("Higher: "+ts.higher());
        // ---------------------------------------- //
        
        // ------- Poll -------
        System.out.println("Poll First: " + ts.pollFirst());
        System.out.println("Poll Last: " + ts.pollLast());

        // ------- Clear -------
        ts.clear();
    }
}
