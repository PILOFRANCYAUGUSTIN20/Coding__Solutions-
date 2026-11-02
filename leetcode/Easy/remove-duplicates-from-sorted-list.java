// Problem: Remove Duplicates from Sorted List
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Solved on: 2026-11-02T09:06:22.987Z

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head,del;
        while(temp!=null && temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                del=temp.next;
                temp.next=temp.next.next;
                del.next=null;
            }
            else
                temp=temp.next;
        }
        return head;
    }
}