class Solution {
    long time(int[] piles, int k){
        long t = 0;
        for(int i = 0;i < piles.length;i++){
            t = t + ((piles[i] + k - 1)/ k);
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles[piles.length - 1];
        int start = 1;
        int end = n;
        long temp = -1;
        int mid = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            temp = time(piles, mid);
            if(h >= temp){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}