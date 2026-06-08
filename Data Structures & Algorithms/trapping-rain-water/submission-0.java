class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        for(int i = 0; i < n; i++){
            leftMax[i] = left;
            if(height[i] > left){
                left = height[i];
            }
        }
        for(int i = n - 1; i >= 0; i--){
            rightMax[i] = right;
            if(height[i] > right){
                right = height[i];
            }
        }
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < n; i++){
            temp =  Math.min(leftMax[i], rightMax[i]) - height[i];
            if(temp > 0){
                sum = sum + temp;
            }
        }
        return sum;
    }
}