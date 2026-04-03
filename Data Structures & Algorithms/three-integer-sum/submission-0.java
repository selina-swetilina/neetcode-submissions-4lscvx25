class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret=new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set=new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(nums[k]);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    set.add(list);
                    i++;
                    j--;
                }
                else if(sum>0){
                    j--;
                }
                else if(sum<0){
                    i++;
                }
            }
        }
        ret.addAll(set);
        return ret;
    }
}