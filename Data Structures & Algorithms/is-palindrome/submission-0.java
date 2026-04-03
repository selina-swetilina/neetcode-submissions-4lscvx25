class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int as=(int)ch;
            if(as>=97 && as<=122){
                str=str+ch;
            }
            if(as>=48 && as<=57){
                str=str+ch;
            }
            if(as>=65 && as<=90){
                int temp=as-65+97;
                ch=(char)temp;  
                str=str+ch;
            }   
        }
        int i=0;
        int j=str.length()-1;
        boolean x=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                x=false;
                break;
            }
            i++;
            j--;
        }
        return x;
    }
}