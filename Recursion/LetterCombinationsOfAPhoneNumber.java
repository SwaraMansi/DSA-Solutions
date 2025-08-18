// LeetCode 17: Letter Combinations of a Phone Number (Recursion/Backtracking)
import java.util.*;
public class LetterCombinationsOfAPhoneNumber {
    private static final String[] MAP = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public java.util.List<String> letterCombinations(String digits) {
        java.util.List<String> res = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return res;
        backtrack(digits, 0, new StringBuilder(), res);
        return res;
    }
    private void backtrack(String digits, int idx, StringBuilder cur, java.util.List<String> res) {
        if (idx == digits.length()) { res.add(cur.toString()); return; }
        String letters = MAP[digits.charAt(idx)-'0'];
        for (int i=0;i<letters.length();i++) {
            cur.append(letters.charAt(i));
            backtrack(digits, idx+1, cur, res);
            cur.deleteCharAt(cur.length()-1);
        }
    }
    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber s = new LetterCombinationsOfAPhoneNumber();
        System.out.println(s.letterCombinations("23"));
    }
}
