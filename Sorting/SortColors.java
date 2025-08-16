// LeetCode 75: Sort Colors (Sorting) — Dutch National Flag
import java.util.*;
public class SortColors {
    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){ int t=nums[low]; nums[low]=nums[mid]; nums[mid]=t; low++; mid++; }
            else if(nums[mid]==1){ mid++; }
            else { int t=nums[high]; nums[high]=nums[mid]; nums[mid]=t; high--; }
        }
    }
    public static void main(String[] args) {
        SortColors s = new SortColors();
        int[] a = {2,0,2,1,1,0};
        s.sortColors(a);
        System.out.println(Arrays.toString(a)); // [0,0,1,1,2,2]
    }
}
