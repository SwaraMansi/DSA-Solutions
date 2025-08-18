// LeetCode 34: Find First and Last Position of Element in Sorted Array (Searching)
import java.util.*;
public class FindFirstAndLastPosition {
    private int findBound(int[] nums, int target, boolean first) {
        int lo=0, hi=nums.length-1, ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){ ans=mid; if(first) hi=mid-1; else lo=mid+1; }
            else if(nums[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target){
        return new int[]{ findBound(nums,target,true), findBound(nums,target,false) };
    }
    public static void main(String[] args) {
        FindFirstAndLastPosition s = new FindFirstAndLastPosition();
        System.out.println(Arrays.toString(s.searchRange(new int[]{5,7,7,8,8,10},8))); // [3,4]
        System.out.println(Arrays.toString(s.searchRange(new int[]{5,7,7,8,8,10},6))); // [-1,-1]
    }
}
