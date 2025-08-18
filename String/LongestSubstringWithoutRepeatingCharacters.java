class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        int left = 0, right = 0, maxLen = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            map[c]++;
            while (map[c] > 1) {
                map[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}