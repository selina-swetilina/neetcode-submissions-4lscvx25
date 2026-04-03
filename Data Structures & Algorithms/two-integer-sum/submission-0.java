class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ret[]=new int[2];
        int x;
        outer:
        for(int i=0;i<n;i++){
            x=nums[i];
            for(int j=i+1;j<n;j++){
                if((x+nums[j])==target){
                    ret[0]=i;
                    ret[1]=j;
                    break outer;
                }
                else{
                    continue;
                }
            }
        }
        return ret;
    }
}
