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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode now = head.next;
        if(now.next == null){
            now.next = prev;
            prev.next = null;
            return now;
        }
        ListNode then = now.next;
        now.next = prev;
        prev.next = null;
        prev = now;
        now = then;
        then = now.next;
        while(then != null){
            now.next = prev;
            prev = now;
            now = then;
            then = now.next;
        }
        now.next = prev;
        return now;
    }
}