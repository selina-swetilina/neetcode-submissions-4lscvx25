class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int k=0;
        int temp1=0;
        int temp2=0;
        while(i<j){
            if(height[i]<height[j]){
                temp1=height[i];
            }
            else{
                temp1=height[j];
            }
            temp2=j-i;
            if(temp1*temp2>k){
                k=temp1*temp2;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return k;
    }
}