/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1){
            return s;
        }
        String max = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String aux = expandAroundCenter(s, i, i);
            if (aux.length() > max.length()){
                max = aux;
            }
            aux = expandAroundCenter(s, i, i + 1);
            if (aux.length() > max.length()){
                max = aux;
            }
        }
        return max;
    }
    
    public String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

}
// @lc code=end

