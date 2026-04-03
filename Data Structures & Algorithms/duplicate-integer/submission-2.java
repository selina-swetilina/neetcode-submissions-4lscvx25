class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean z=false;
        int n=nums.length;
        int y;
        outer:
        for(int i=0;i<n;i++){
            y=nums[i];
            for(int j=i+1;j<n;j++){
                if(y==nums[j]){
                    z=true;
                    break outer;
                }
                else{
                    z=false;
                }
            }
        }
        return z;
    }
}