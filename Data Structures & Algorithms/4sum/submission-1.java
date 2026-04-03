class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int a=0;a<nums.length-3;a++){
            if(a>0 && nums[a]==nums[a-1]){
                continue;
            }
            for(int b=a+1;b<nums.length-2;b++){
                if(b>a+1 && nums[b]==nums[b-1]){
                    continue;
                }
                int c=b+1;
                int d=nums.length-1;
                long tar=(long)target;
                long x=(long)nums[a];
                long y=(long)nums[b];
                long temp=tar-x-y;
                while(c<d){
                    if(c>b+1 && nums[c]==nums[c-1]){
                        c++;
                        continue;
                    }
                    if(d<nums.length-1 && nums[d]==nums[d+1]){
                        d--;
                        continue;
                    }
                    long s=(long)nums[c];
                    long t=(long)nums[d];
                    if(s+t==temp){
                        List<Integer> list=new ArrayList<Integer>();
                        list.add(nums[a]);
                        list.add(nums[b]);
                        list.add(nums[c]);
                        list.add(nums[d]);
                        ret.add(list);
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
        return ret;
    }
}