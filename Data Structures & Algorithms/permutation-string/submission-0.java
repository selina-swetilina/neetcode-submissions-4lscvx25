class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean ret=false;
        if(s1.length()>s2.length()){
            return ret;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i),1);
            }
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int r=s1.length()-1;
        int l=0;
        for(int i=0;i<=r;i++){
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            }
            else{
                map2.put(s2.charAt(i),1);
            }
        }
        if(map.equals(map2)){
            ret=true;
            return ret;
        }
        while(r+1<s2.length()){
            if(map2.get(s2.charAt(l))==1){
                map2.remove(s2.charAt(l));
            }
            else{
                map2.put(s2.charAt(l),map2.get(s2.charAt(l))-1);
            }
            if(map2.containsKey(s2.charAt(r+1))){
                map2.put(s2.charAt(r+1),map2.get(s2.charAt(r+1))+1);
            }
            else{
                map2.put(s2.charAt(r+1),1);
            }
            if(map.equals(map2)){
            ret=true;
            return ret;
            }
            r++;
            l++;
        }
        return ret;
    }
}