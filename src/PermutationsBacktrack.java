import java.util.*;

public class PermutationsBacktrack {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, boolean[] used,
                                  List<Integer> curr, List<List<Integer>> result) {
        // base case
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr)); // record one complete permutation
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;         // skip already used elements

            // --- CHOOSE ---
            used[i] = true;
            curr.add(nums[i]);
            System.out.println("add: "+nums[i]);

            // --- EXPLORE ---
            backtrack(nums, used, curr, result);

            // --- UNCHOOSE (backtrack) ---
            // System.out.println("remove: "+curr.get(curr.size() - 1));
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}
