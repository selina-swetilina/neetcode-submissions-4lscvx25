class Solution {
    Boolean isSubset(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2){
        for(Character key:map1.keySet()){
            if(!map2.containsKey(key) || map2.get(key)<map1.get(key)){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int check=0;
        String temp="";
        String ret=s;
        if(s.length()<t.length()){
            return temp;
        }
        if(s.equals(t)){
            return t;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i),map1.get(t.charAt(i))+1);
            }
            else{
                map1.put(t.charAt(i),1);
            }
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int l=0;
        int r=0;
        while(r<s.length()){
            if(map2.containsKey(s.charAt(r))){
                map2.put(s.charAt(r),map2.get(s.charAt(r))+1);
            }
            else{
                map2.put(s.charAt(r),1);
            }
            if(isSubset(map1,map2)){
                while(isSubset(map1,map2)){
                    temp=s.substring(l,r+1);
                    if(temp.length()<=ret.length()){
                        check=1;
                        ret=temp;
                    }
                    if(map2.get(s.charAt(l))==1){
                        map2.remove(s.charAt(l));
                    }
                    else{
                        map2.put(s.charAt(l),map2.get(s.charAt(l))-1);
                    }
                    l++;
                }
            }
            r++;
        }
        if(check==0){
            ret="";
        }
        return ret;
    }
}