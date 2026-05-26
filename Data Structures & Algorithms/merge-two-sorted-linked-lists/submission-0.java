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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }
        ListNode head = new ListNode();
        if(list1.val <= list2.val){
            ListNode temp = new ListNode(list1.val);
            head = temp;
            list1 = list1.next;
        } 
        else{
            ListNode temp = new ListNode(list2.val);
            head = temp;
            list2 = list2.next;
        }
        ListNode prev = head;
        while(list1 != null && list2 != null ){
            if(list1.val <= list2.val){
                ListNode temp = new ListNode(list1.val);
                prev.next = temp;
                list1 = list1.next;
            }
            else{
                ListNode temp = new ListNode(list2.val);
                prev.next = temp;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        while(list1 != null){
            ListNode temp = new ListNode(list1.val);
            prev.next = temp;
            list1 = list1.next;
            prev = prev.next;
        }
        while(list2 != null){
            ListNode temp = new ListNode(list2.val);
            prev.next = temp;
            list2 = list2.next;
            prev = prev.next;
        }
        return head;
    }
}