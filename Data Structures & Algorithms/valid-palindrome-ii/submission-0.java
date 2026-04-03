class Solution {
    public boolean palindrome(String s,int i,int j){
        boolean ret=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                ret=false;
                break;
            }
            i++;
            j--;
        }
        return ret;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean ret=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                boolean x=palindrome(s,i+1,j);
                boolean y=palindrome(s,i,j-1);
                if(x==false && y==false){
                    ret=false;
                    break;
                }
                else{
                    ret=true;
                    break;
                }
            }
            i++;
            j--;
        }
        return ret;
    }
}