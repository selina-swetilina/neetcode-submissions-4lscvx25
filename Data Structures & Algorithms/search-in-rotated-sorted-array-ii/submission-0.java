class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(nums[mid] == target){
                    return true;
                }
                else{
                    start++;
                    end--;
                }
            }
            else if(nums[start] <= nums[mid]){
                if(target < nums[mid] && target >= nums[start]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(nums[end] >= nums[mid]){
                if(target <= nums[end] && target > nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
                
            }
        }
        return false;
    }
}