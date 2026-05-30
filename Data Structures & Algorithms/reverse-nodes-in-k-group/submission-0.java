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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int left = 1;
        int right = k;
        while(temp1 != null){
            int arr[] = new int[k];
            for(int i = 0; i < k; i++){
                if(temp1 != null){
                    arr[i] = temp1.val;
                    temp1 = temp1.next;
                }
                else{
                    return head;
                }
            }
            for(int i = k - 1; i >= 0; i--){
                temp2.val = arr[i];
                temp2 = temp2.next;
            }
        }
        return head;
    }
}