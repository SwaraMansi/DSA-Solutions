// LeetCode 74: Search a 2D Matrix (Searching)
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int lo=0, hi=m*n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int val = matrix[mid/n][mid%n];
            if(val==target) return true;
            if(val<target) lo=mid+1; else hi=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Search2DMatrix s = new Search2DMatrix();
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(s.searchMatrix(mat, 3));  // true
        System.out.println(s.searchMatrix(mat, 13)); // false
    }
}
