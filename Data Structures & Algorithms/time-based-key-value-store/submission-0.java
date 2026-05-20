class TimeMap {
    HashMap<String, List<pair>> map;
    class pair{
        String value;
        int timestamp;
        pair(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        pair obj = new pair(value, timestamp);
        if(map.containsKey(key)){
            map.get(key).add(obj);
        }
        else{
            List<pair> list = new ArrayList<>();
            list.add(obj);
            map.put(key,list);
        }
    }
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        List<pair> list = new ArrayList<>();
        list = map.get(key);
        int start = 0;
        int end = list.size() - 1;
        int mid = -1;
        String ret = "";
        while(start <= end){
            mid = start + (end - start) / 2;
            if(list.get(mid).timestamp <= timestamp){
                ret = list.get(mid).value;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ret;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */