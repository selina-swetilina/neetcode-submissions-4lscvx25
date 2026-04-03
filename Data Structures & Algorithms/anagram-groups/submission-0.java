class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String str="";
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ret=new ArrayList<>();
        for (int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            str=new String(arr);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
            }
        }
        Set<String> keys=map.keySet();
        for(String key:keys){
            ret.add(map.get(key));
        }
        return ret;
    }
}