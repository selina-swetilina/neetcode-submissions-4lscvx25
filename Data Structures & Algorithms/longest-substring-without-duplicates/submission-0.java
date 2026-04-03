class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int length=0;
        int i=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(right));
            length=Math.max(length,right-i+1);
        }
        return length;
    }
}