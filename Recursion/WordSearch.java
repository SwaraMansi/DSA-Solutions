// LeetCode 79: Word Search (Recursion/Backtracking)
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for (int i=0;i<m;i++) for (int j=0;j<n;j++) if (dfs(board, word, 0, i, j, vis)) return true;
        return false;
    }
    private boolean dfs(char[][] b, String w, int k, int i, int j, boolean[][] vis) {
        if (k == w.length()) return true;
        if (i<0||j<0||i>=b.length||j>=b[0].length||vis[i][j]||b[i][j]!=w.charAt(k)) return false;
        vis[i][j] = true;
        boolean ok = dfs(b,w,k+1,i+1,j,vis) || dfs(b,w,k+1,i-1,j,vis) || dfs(b,w,k+1,i,j+1,vis) || dfs(b,w,k+1,i,j-1,vis);
        vis[i][j] = false;
        return ok;
    }
    public static void main(String[] args) {
        WordSearch s = new WordSearch();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(s.exist(board, "ABCCED")); // true
        System.out.println(s.exist(board, "SEE"));    // true
        System.out.println(s.exist(board, "ABCB"));   // false
    }
}
