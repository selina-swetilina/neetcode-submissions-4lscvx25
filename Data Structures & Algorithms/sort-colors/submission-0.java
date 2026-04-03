class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.get(nums[i])+1);
        }
        int c=0;
        int d;
        for(int i=0;i<map.get(0);i++){
            nums[i]=0;
            c++;
        }
        d=c;
        for(int i=c;i<map.get(1)+d;i++){
            nums[i]=1;
            c++;
        }
        d=c;
        for(int i=c;i<map.get(2)+d;i++){
            nums[i]=2;
        }
    }
}