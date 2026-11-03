// Problem: Delete the Middle Node of a Linked List
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Solved on: 2026-11-03T05:07:39.380Z

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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null || head==null)
            return null;
        ListNode prev=null,slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        } 
        prev.next=slow.next;
        slow.next=null;
        return head ;

    }
}