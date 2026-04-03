class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ret=true;
        if(s.length()==t.length()){ 
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                if(map.containsKey(ch)){
                    if(map.get(ch)==1){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch,map.get(ch)-1);
                    }
                }
                else{
                    ret=false;
                    break;
                }
            }
        }
        else{
            ret=false;
        }
        return ret;
    }
}
