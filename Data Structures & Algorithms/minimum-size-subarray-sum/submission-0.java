class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        int min=nums.length+1;
        int temp=0;
        while(r<nums.length){
            sum=sum+nums[r];
            if(sum>=target){
                temp++;
                while(sum>=target){
                    count=r-l+1;
                    if(count<min){
                        min=count;
                    }
                    sum=sum-nums[l];
                    l++;
                }
            }
            r++;
        }
        if(temp==0){
            min=0;
        }
        return min;
    }
}