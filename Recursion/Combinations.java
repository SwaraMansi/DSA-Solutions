// LeetCode 77: Combinations (Recursion/Backtracking)
import java.util.*;
public class Combinations {
    public java.util.List<java.util.List<Integer>> combine(int n, int k) {
        java.util.List<java.util.List<Integer>> res = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int start, int n, int k, java.util.List<Integer> cur, java.util.List<java.util.List<Integer>> res) {
        if (cur.size() == k) { res.add(new ArrayList<>(cur)); return; }
        for (int i = start; i <= n; i++) {
            cur.add(i);
            backtrack(i+1, n, k, cur, res);
            cur.remove(cur.size()-1);
        }
    }
    public static void main(String[] args) {
        Combinations s = new Combinations();
        System.out.println(s.combine(4,2)); // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
    }
}
