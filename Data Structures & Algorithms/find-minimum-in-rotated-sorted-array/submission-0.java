class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        int ret = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(nums[mid] >= nums[0]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
                ret = start;
            }
        }
        if(ret == -1){
            ret = 0;
        }
        else{
            ret = start;
        }
        return nums[ret];
    }
}