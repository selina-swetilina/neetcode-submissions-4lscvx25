class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String str3 = str1 + str2;
        String str4 = str2 + str1;
        if(str3.equals(str4) == false){
            return "";
        }
        int a = str1.length();
        int b = str2.length();
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return str1.substring(0,a);
    }
}