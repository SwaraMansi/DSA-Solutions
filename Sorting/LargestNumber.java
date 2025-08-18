// LeetCode 179: Largest Number (Sorting with custom comparator)
import java.util.*;
public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for (int i=0;i<nums.length;i++) s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        if (s[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String str : s) sb.append(str);
        return sb.toString();
    }
    public static void main(String[] args) {
        LargestNumber s = new LargestNumber();
        System.out.println(s.largestNumber(new int[]{3,30,34,5,9})); // 9534330
    }
}
