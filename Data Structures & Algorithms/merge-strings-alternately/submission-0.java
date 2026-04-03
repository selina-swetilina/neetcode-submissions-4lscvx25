class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word3="";
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            word3=word3+word1.charAt(i)+word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length()){
            word3=word3+word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            word3=word3+word2.charAt(j);
            j++;
        }
        return word3;
    }
}