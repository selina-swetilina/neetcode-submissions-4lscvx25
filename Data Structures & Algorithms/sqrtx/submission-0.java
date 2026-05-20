class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = -1;
        long temp = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            temp = (long)mid * mid;
            if(temp == x){
                return mid;
            }
            else if(temp < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start - 1;
    }
}