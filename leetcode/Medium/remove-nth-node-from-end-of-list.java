// Problem: Remove Nth Node From End of List
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Solved on: 2026-11-03T05:55:44.004Z

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        ListNode del=null;
        for(int i=0;i<n;i++){
            if(fast==null)
                return head;
            fast=fast.next;
        }
        if(fast==null){
            del=head;
            head=head.next;
            del.next=null;
            return head;
        }
        while(fast!=null){
            prev =slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        slow.next=null;
        return head;
    }

}