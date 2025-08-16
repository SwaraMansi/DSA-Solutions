// LeetCode 215: Kth Largest Element in an Array (Sorting/Quickselect)
import java.util.*;
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) { return quickselect(nums, 0, nums.length-1, nums.length-k); }
    private int quickselect(int[] a, int l, int r, int k) {
        while (l <= r) {
            int p = partition(a, l, r);
            if (p == k) return a[p];
            if (p < k) l = p + 1; else r = p - 1;
        }
        return -1;
    }
    private int partition(int[] a, int l, int r) {
        int pivot = a[r], i = l;
        for (int j = l; j < r; j++) if (a[j] <= pivot) { int t=a[i]; a[i]=a[j]; a[j]=t; i++; }
        int t=a[i]; a[i]=a[r]; a[r]=t; return i;
    }
    public static void main(String[] args) {
        KthLargestElementInAnArray s = new KthLargestElementInAnArray();
        System.out.println(s.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
    }
}
