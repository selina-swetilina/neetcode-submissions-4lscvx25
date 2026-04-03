class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int r=0;
        int length=0;
        int maxlength=0;
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                while(s.charAt(l)!=s.charAt(r)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
            }
            length=r-l+1;
            if(length>maxlength){
                maxlength=length;
            }
            set.add(s.charAt(r));
            r++;
        }
        return maxlength;
    }
}