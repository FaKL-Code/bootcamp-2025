/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length; 
        
        if (n > m) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int total = n + m;
        int half = (total + 1) / 2;

        int menor = 0;
        int maior = n;

        while (menor <= maior) {
            int meio = (maior + menor) / 2;
            int meio2 = half - meio;

            int l1 = (meio == 0) ? Integer.MIN_VALUE : nums1[meio - 1];
            int l2 = (meio2 == 0) ? Integer.MIN_VALUE : nums2[meio2 - 1];
            int r1 = (meio == n) ? Integer.MAX_VALUE : nums1[meio];
            int r2 = (meio2 == m) ? Integer.MAX_VALUE : nums2[meio2];

            if (l1 > r2) {
                maior = meio - 1;
            } else if (l2 > r1) {
                menor = meio + 1;
            } else {
                if (total % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }
        }
        return 0;
    }
}
// @lc code=end

