import java.util.*;

public class CombinationSumBackTrack {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // optional but useful for pruning/consistency
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int idx, int[] arr, int target,
                                  List<Integer> curr, List<List<Integer>> result) {
        // base case: found exact target
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        // ran out of candidates or target negative
        if (idx == arr.length || target < 0) return;

        // Option 1: choose arr[idx] (we stay on same idx since repetition allowed)
        if (arr[idx] <= target) {
            System.out.println(arr[idx]);
            curr.add(arr[idx]);                  // choose
            backtrack(idx, arr, target - arr[idx], curr, result); // explore
            curr.remove(curr.size() - 1);        // unchoose
        }

        // Option 2: skip arr[idx] and move to next candidate
        backtrack(idx + 1, arr, target, curr, result);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
