// LeetCode 217: Contains Duplicate (Array)
import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) if (!seen.add(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate s = new ContainsDuplicate();
        System.out.println(s.containsDuplicate(new int[]{1,2,3,1})); // true
    }
}
