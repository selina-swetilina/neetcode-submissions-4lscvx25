/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node ret = new Node(head.val);
        map.put(head, ret);
        Node temp = head.next;
        Node prev = ret;
        while(temp != null){
            Node temp1 = new Node(temp.val);
            prev.next = temp1;
            prev = temp1;
            map.put(temp, temp1);
            temp = temp.next;
        }
        temp = head;
        Node ran = head;
        Node temp1 = ret;
        while(temp != null){
            ran = temp.random;
            temp1.random = map.get(ran);
            temp = temp.next;
            temp1 = temp1.next;
        }
        return ret;
    }
}