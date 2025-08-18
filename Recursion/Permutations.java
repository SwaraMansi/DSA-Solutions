// LeetCode 46: Permutations (Recursion/Backtracking)
import java.util.*;
public class Permutations {
    public java.util.List<java.util.List<Integer>> permute(int[] nums) {
        java.util.List<java.util.List<Integer>> res = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] nums, boolean[] used, java.util.List<Integer> cur, java.util.List<java.util.List<Integer>> res) {
        if (cur.size() == nums.length) { res.add(new ArrayList<>(cur)); return; }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true; cur.add(nums[i]);
            backtrack(nums, used, cur, res);
            cur.remove(cur.size()-1); used[i] = false;
        }
    }
    public static void main(String[] args) {
        Permutations s = new Permutations();
        System.out.println(s.permute(new int[]{1,2,3}));
    }
}
