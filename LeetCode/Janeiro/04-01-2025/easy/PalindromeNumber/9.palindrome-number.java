/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    
    ArrayList<Integer> arr = new ArrayList<>();

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        arr.clear();
        fillArray(x);
        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i) != arr.get(arr.size() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    
    public void fillArray(int num){
        if (num != 0){
            arr.add(num % 10);
            fillArray(num / 10);
        }

    }

}
// @lc code=end

