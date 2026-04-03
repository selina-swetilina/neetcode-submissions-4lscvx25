class Solution {
    public void conquer(int[] arr,int s,int e,int mid){
        int temp[]=new int[e-s+1];
        int indx1=s;
        int indx2=mid+1;
        int i=0;
        while(indx1<=mid && indx2<=e){
            if(arr[indx1]<=arr[indx2]){
                temp[i]=arr[indx1];
                i++;
                indx1++;
            }
            else{
                temp[i]=arr[indx2];
                i++;
                indx2++;
            }
        }
        while(indx1<=mid){
            temp[i]=arr[indx1];
            i++;
            indx1++;
        }
        while(indx2<=e){
            temp[i]=arr[indx2];
            i++;
            indx2++;
        }
        for(int j=0,k=s;j<temp.length;j++,k++){
            arr[k]=temp[j];
        }
    }
    public void divide(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,e,mid);
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        divide(nums,0,n-1);
        return nums;
    }
}