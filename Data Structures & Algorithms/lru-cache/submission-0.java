class LRUCache {
    int capacity;
    class Pair{
        int key;
        int value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    class ListNode{
        Pair combo;
        ListNode next;
        ListNode prev;
        ListNode(Pair combo){
            this.combo = combo;
        }
        ListNode(Pair combo, ListNode next, ListNode prev){
            this.combo = combo;
            this.next = next;
            this.prev = prev;
        }
        ListNode(){}
    }
    ListNode ptr;
    ListNode head;
    HashMap<Integer, ListNode> map;
    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        ListNode node = map.get(key);
        if(node.next == null){
            return node.combo.value;
        }
        if(node.prev == null){
            head = head.next;
            head.prev = null;
            ptr.next = node;
            node.prev = ptr;
            node.next = null;
            ptr = node;
            return node.combo.value;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        ptr.next = node;
        node.prev = ptr;
        node.next = null;
        ptr = node;
        return node.combo.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            if(node.next == null){
                node.combo.value = value;
                return;
            }
            if(node.prev == null){
                head = head.next;
                head.prev = null;
                ptr.next = node;
                node.prev = ptr;
                node.next = null;
                ptr = node;
                node.combo.value = value;
                return;
            }
            node.prev.next = node.next;
            node.next.prev = node.prev;
            ptr.next = node;
            node.prev = ptr;
            node.next = null;
            ptr = node; 
            node.combo.value = value;
        }
        else{
            Pair p = new Pair(key, value);
            if(map.size() < capacity){
                if(head == null){
                    ListNode node = new ListNode(p);
                    head = node;
                    ptr = node;
                    map.put(key, node);
                }
                else{
                    ListNode node = new ListNode(p, null, ptr);
                    ptr.next = node;
                    ptr = node;
                    map.put(key, node);
                }
            }
            else{
                if(capacity == 1){
                    map.remove(head.combo.key);
                    head.combo = p;
                    map.put(key, head);
                }
                ListNode node = new ListNode(p, null, ptr);
                ptr.next = node;
                ptr = node;
                int temp = head.combo.key;
                map.remove(temp);
                head = head.next;
                head.prev = null;
                map.put(key, node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */