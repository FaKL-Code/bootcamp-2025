/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int aux = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && aux <= map.get(s.charAt(i))+ 1) {
                aux = map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i), i);
            if(max <= i - aux + 1) {
                max = i - aux + 1;
            }
        }
        return max;
    }
}   
// @lc code=end

