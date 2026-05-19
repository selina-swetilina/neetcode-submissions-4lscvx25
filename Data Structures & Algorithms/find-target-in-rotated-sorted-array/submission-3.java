class Solution {
    public int search(int[] nums, int target) {
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
        if(ret == 0){
            start = 0;
            end = nums.length -1;
        }
        else if(target <= nums[nums.length - 1]){
            start = ret;
            end = nums.length - 1;
        }
        else{
            start = 0;
            end = ret - 1;
        }
        while(start <= end){
            mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}