class Solution {
    int split(int[] nums, int n){
        int k = 1;
        int temp = n;
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            temp = temp - nums[i];
            if(temp >= 0){
                continue;
            }
            else{
                count++;
                temp = n;
                temp = temp - nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int start = max;
        int end = sum;
        int mid = -1;
        int temp = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            temp = split(nums, mid);
            if(temp <= k){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}