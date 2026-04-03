class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean ret=false;
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[0]);
        if(nums.length<=k){
            for(int i=1;i<nums.length;i++){
                if(set.contains(nums[i])){
                    ret=true;
                    return ret;
                }
                else{
                    set.add(nums[i]);
                }
            }
            return ret;
        }
        for(int i=1;i<k+1;i++){
            if(set.contains(nums[i])){
                ret=true;
                return ret;
            }
            else{
                set.add(nums[i]);
            }
        }
        for(int i=1;i<=nums.length-k-1;i++){
            set.remove(nums[i-1]);
            if(set.contains(nums[i+k])){
                ret=true;
                return ret;
            }
            else{
                set.add(nums[i+k]);
            }
        }
        return ret;
    }
}