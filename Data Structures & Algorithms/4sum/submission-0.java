class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set=new HashSet<List<Integer>>();
        List<List<Integer>> ret=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int a=0;a<nums.length-3;a++){
            for(int b=a+1;b<nums.length-2;b++){
                int c=b+1;
                int d=nums.length-1;
                long tar=(long)target;
                long x=(long)nums[a];
                long y=(long)nums[b];
                long temp=tar-x-y;
                while(c<d){
                    long s=(long)nums[c];
                    long t=(long)nums[d];
                    if(s+t==temp){
                        List<Integer> list=new ArrayList<Integer>();
                        list.add(nums[a]);
                        list.add(nums[b]);
                        list.add(nums[c]);
                        list.add(nums[d]);
                        set.add(list);
                        c++;
                        d--;
                    }
                    else if(s+t<temp){
                        c++;
                    }
                    else if(s+t>temp){
                        d--;
                    }
                }
            }
        }
        ret.addAll(set);
        return ret;
    }
}