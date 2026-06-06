class MyHashMap {
    class Pair{
        int key;
        int value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<Pair> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).key == key){
                list.get(i).value = value;
                return;
            }
        }
        list.add(new Pair(key, value));
    }
    
    public int get(int key) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).key == key){
                return list.get(i).value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).key == key){
                list.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */