/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        int soma = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                soma += l1.val;
            }
            if(l2 != null){
                soma += l2.val;
            }
            l1.val = soma % 10;
            soma = soma / 10;
            if(l1.next == null && ((l2 != null && l2.next != null) || soma > 0)){
                l1.next = new ListNode(0);
            }
            if(l2 != null){
                l2 = l2.next;
            }
            if(l1 != null){
                l1 = l1.next;
            }
        }
        return result;
    }
}
// @lc code=end
