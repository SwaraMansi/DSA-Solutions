// LeetCode 56: Merge Intervals (Sorting)
import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        java.util.List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0].clone();
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0] <= cur[1]) cur[1] = Math.max(cur[1], intervals[i][1]);
            else { res.add(cur); cur = intervals[i].clone(); }
        }
        res.add(cur);
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        MergeIntervals s = new MergeIntervals();
        int[][] out = s.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for (int[] x : out) System.out.print("[" + x[0] + "," + x[1] + "] ");
        // [1,6] [8,10] [15,18] 
    }
}
