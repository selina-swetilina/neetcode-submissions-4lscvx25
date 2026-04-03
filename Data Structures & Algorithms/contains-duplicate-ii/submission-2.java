class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        boolean ret=false;
        int i=0;
        int j=i+k;
        int it=i;
        while(it<nums.length && it<=j){ 
            if(set.contains(nums[it])){
                ret=true;
                return ret;
            }
            else{
                set.add(nums[it]);
                it++;
            }
        }
        j++;
        while(j<nums.length){
            set.remove(nums[i]);
            i++;
            if(set.contains(nums[j])){
                ret=true;
                return ret;
            }
            else{
                set.add(nums[j]);
            }
            j++;
        }
        return ret;
    }
}