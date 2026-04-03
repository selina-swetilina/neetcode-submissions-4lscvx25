class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i).getKey();
        }
        return arr;
    }
}
