// LeetCode 704: Binary Search (Searching)
public class BinarySearch {
    public int search(int[] nums, int target) {
        int lo=0, hi=nums.length-1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if (nums[mid]==target) return mid;
            if (nums[mid]<target) lo=mid+1; else hi=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch s = new BinarySearch();
        System.out.println(s.search(new int[]{-1,0,3,5,9,12},9)); // 4
        System.out.println(s.search(new int[]{-1,0,3,5,9,12},2)); // -1
    }
}
