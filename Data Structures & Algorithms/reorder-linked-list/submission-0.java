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
    public void reorderList(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            s.push(temp);
            temp = temp.next;
        }
        if(count < 3){
            return;
        }
        if(count == 3){
            ListNode temp1 = head.next;
            head.next = temp1.next;
            head.next.next = temp1;
            temp1.next = null;
            return;
        }
        ListNode ptr1 = head;
        ListNode then = ptr1.next;
        ListNode ptr2 = s.pop();
        ListNode prev = s.pop();
        while(count >= 4){
            ptr1.next = ptr2;
            ptr2.next = then;
            prev.next = null;
            ptr1 = then;
            then = ptr1.next;
            ptr2 = prev;
            prev = s.pop();
            count = count - 2;
        }
        if(count == 3){
            ptr1.next = ptr2;
            ptr2.next = then;
            then.next = null;
        }
        else{
            return;
        }
        
    }
}