class Solution {
    public void reverse(int[] arr,int s,int e){
        int i=s;
        int j=e;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        if(k>nums.length){
            k=k%nums.length;
        }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
}