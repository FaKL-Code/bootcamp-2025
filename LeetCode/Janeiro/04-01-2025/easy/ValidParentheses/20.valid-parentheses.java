/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> openChars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                openChars.add(c);
            } else {
                if (openChars.isEmpty()) {
                    return false;
                }
                char openChar = openChars.remove(openChars.size() - 1);
                if (c == ')' && openChar != '(') {
                    return false;
                }
                if (c == '}' && openChar != '{') {
                    return false;
                }
                if (c == ']' && openChar != '[') {
                    return false;
                }
            }
        }
        return openChars.isEmpty();
    }
}
// @lc code=end

