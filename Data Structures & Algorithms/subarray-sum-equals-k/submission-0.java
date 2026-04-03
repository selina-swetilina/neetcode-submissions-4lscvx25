class Solution {
    public int subarraySum(int[] nums, int k) {
        int ret=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum-k)){
                ret=ret+map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return ret;
    }
}