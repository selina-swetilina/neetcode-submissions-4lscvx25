class Solution {
    public int[] plusOne(int[] digits) {
        int temp1 = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int temp = digits[i] + temp1;
            if(temp > 9){
                digits[i] = temp % 10;
                temp1 = temp / 10;
            }
            else{
                temp1 = 0;
                digits[i] = temp;
                break;
            }
        }
        if(temp1 != 0){
            int ret[] = new int[digits.length + 1];
            ret[0] = temp1;
            for(int i = 1 ; i < ret.length; i++){
                ret[i] = digits[i - 1];
            }
            return ret;
        }
        return digits;
    }
}