class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int ret=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>nums.length/2){
                ret=nums[i];
                break;
            }
            else{
                count=1;
            }
        }
        return ret;
    }
}