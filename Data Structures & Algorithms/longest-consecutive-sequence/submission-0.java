class Solution {
    public int longestConsecutive(int[] nums) {
        int ret=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            int a=it.next();
            if(!set.contains(a-1)){
                nums[count]=a;
                count++;
            }
        }
        for(int i=0;i<count;i++){
            int j=1;
            int k=nums[i];
            while(set.contains(k+1)){
                j++;
                k=k+1;
            }
            if(j>ret){
                ret=j;
            }
        }
        return ret;
    }
}
