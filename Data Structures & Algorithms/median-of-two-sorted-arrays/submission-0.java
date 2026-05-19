class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int templen = m;
            m = n;
            n = templen;
        }
        int half = (m + n + 1) / 2;
        int start = 0;
        int end = m;
        int temp = -1;
        int mid = -1;
        int left1, left2, right1, right2 = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            temp = half - mid;
            if(mid == 0){
                left1 = Integer.MIN_VALUE;
            }
            else{
                left1 = nums1[mid - 1];
            }
            if(mid == m){
                right1 = Integer.MAX_VALUE;
            }
            else{
                right1 = nums1[mid];
            }
            if(temp == 0){
                left2 = Integer.MIN_VALUE;
            }
            else{
                left2 = nums2[temp - 1];
            }
            if(temp == n){
                right2 = Integer.MAX_VALUE;
            }
            else{
                right2 = nums2[temp];
            }
            if(left1 <= right2 && left2 <= right1){
                if((m + n) % 2 == 0){
                    return Math.max(left1, left2) / 2.0 + Math.min(right1, right2) / 2.0;
                }
                else{
                    return Math.max(left1, left2);
                }
            }
            else if(left1 > right2){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return 0;
    }
}