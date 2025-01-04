/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String palavra1 = strs[0];
        String palavra2 = strs[strs.length - 1];
        for (int i = 0; i < Math.min(palavra1.length(), palavra2.length()); i++) {
            if (palavra1.charAt(i) != palavra2.charAt(i)) {
                return result.toString();	
            } 
            result.append(palavra1.charAt(i));
        }
        return result.toString();
    }
}
// @lc code=end
