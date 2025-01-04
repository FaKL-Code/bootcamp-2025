/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int aux = 0;
        for(int i = 0; i < nums.length; i++){
            aux = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == aux){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
// @lc code=end

