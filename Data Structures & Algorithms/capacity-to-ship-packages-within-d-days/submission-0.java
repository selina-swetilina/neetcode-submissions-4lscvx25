class Solution {
    boolean capacity(int[] weights, int days, int n){
        int x = n;
        int count = 1;
        for(int i = 0;i < weights.length; i++){
            x = x - weights[i];
            if(x >= 0){
                continue;
            }
            else{
                count++;
                x = n;
                x = x - weights[i];
            }
        }
        if(count <= days){
            return true;
        }
        else{
            return false;
        }
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = weights[0];
        int large = weights[0];
        for(int i = 1; i < weights.length; i++){
            sum = sum + weights[i];
            if(weights[i] > large){
                large = weights[i];
            }
        }
        int start = large;
        int end = sum;
        int mid = -1;
        boolean x = false;
        while(start <= end){
            mid = start + (end - start) / 2;
            x = capacity(weights, days, mid);
            if(x == true){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}