class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sb;
        String temp;
        sb=strs[0];
        temp="";
        String ret="";
        int j=0;
        for(int i=1;i<strs.length;i++){
            temp=strs[i];
            if(sb.length()>temp.length()){
                temp=sb;
                sb=strs[i];
            }
            j=0;
            while((j<sb.length())&&(sb.charAt(j)==temp.charAt(j))){
                j++;
            }
            sb=sb.substring(0,j);
        }
        return sb;
    }
}