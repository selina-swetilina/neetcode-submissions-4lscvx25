class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ret[]=new int[2];
        int i=0;
        int j=numbers.length-1;
        int k=0;
        while(i<j){
            k=numbers[i]+numbers[j];
            if(k==target){
                ret[0]=i+1;
                ret[1]=j+1;
                break;
            }
            else if(k>target){
                j--;
            }
            else if(k<target){
                i++;
            }
        }
        return ret;
    }
}