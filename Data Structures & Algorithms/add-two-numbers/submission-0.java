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
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int num2 = 0;
        int num3 = 0;
        int num1 = temp1.val + temp2.val;
        num2 = num1 % 10;
        num3 = num1 / 10;
        ListNode head = new ListNode(num2);
        ListNode prev = head;
        temp1 = temp1.next;
        temp2 = temp2.next;
        while(temp1 != null && temp2 != null){
            num1 = temp1.val + temp2.val + num3;
            num2 = num1 % 10;
            num3 = num1 / 10;
            ListNode temp = new ListNode(num2);
            prev.next = temp;
            prev = temp; 
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null){
            num1 = temp1.val + num3;
            num2 = num1 % 10;
            num3 = num1 / 10;
            ListNode temp = new ListNode(num2);
            prev.next = temp;
            prev = temp;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            num1 = temp2.val + num3;
            num2 = num1 % 10;
            num3 = num1 / 10;
            ListNode temp = new ListNode(num2);
            prev.next = temp;
            prev = temp;
            temp2 = temp2.next;
        }
        if(num3 != 0){
            ListNode temp = new ListNode(num3);
            prev.next = temp;
        }
        return head;
    }
}