// Problem: Remove Linked List Elements
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/remove-linked-list-elements/
// Solved on: 2026-11-03T06:19:32.927Z

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head, del;
        if(head == null)
            return head;
        while (head != null && head.val == val) {
            head = head.next;
        }
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        while(temp.next != null)
            temp = temp.next;
        temp.next = null;

        return head ;
    }
}