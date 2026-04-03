class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ret=1;
        while(set.contains(ret)){
            ret++;
        }
        return ret;
    }
}