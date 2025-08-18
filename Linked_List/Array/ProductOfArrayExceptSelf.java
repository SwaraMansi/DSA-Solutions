// LeetCode 238: Product of Array Except Self (Array)
import java.util.*;
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1, right = 1;
        for (int i = 0; i < n; i++) { res[i] = left; left *= nums[i]; }
        for (int i = n-1; i >= 0; i--) { res[i] *= right; right *= nums[i]; }
        return res;
    }
    public static void main(String[] args) {
        ProductOfArrayExceptSelf s = new ProductOfArrayExceptSelf();
        System.out.println(java.util.Arrays.toString(s.productExceptSelf(new int[]{1,2,3,4}))); // [24,12,8,6]
    }
}
