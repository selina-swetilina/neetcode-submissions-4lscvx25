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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n = right - left + 1;
        int arr[] = new int[n];
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i = 0; i < left - 1; i++){
            temp1 = temp1.next;
            temp2 = temp2.next; 
        }
        for(int i = 0; i < n; i++){
            arr[i] = temp1.val;
            temp1 = temp1.next;
        }
        for(int i = n-1; i >= 0; i--){
            temp2.val = arr[i];
            temp2 = temp2.next;
        }
        return head;
    }
}