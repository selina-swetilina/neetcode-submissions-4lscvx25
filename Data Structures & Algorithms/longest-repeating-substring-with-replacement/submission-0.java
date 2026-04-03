class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>(); 
        int l=0;
        int r=0;
        int maxfreq=0;
        int length=0;
        int maxlength=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
            }
            else{
                map.put(s.charAt(r),1);
            }
            maxfreq=Math.max(maxfreq,map.get(s.charAt(r)));
            while((r-l+1)-maxfreq>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            length=r-l+1;
            if(length>maxlength){
                maxlength=length;
            }
            r++;
        }
        return maxlength;
    }
}