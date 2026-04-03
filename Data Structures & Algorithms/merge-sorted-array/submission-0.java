class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        while(j<n){
            if(i==m){
                for(int k=i;k<nums1.length;k++){
                    nums1[k]=nums2[j];
                    j++;
                }
                return;
            }
            else{
                while(i<m && nums1[i]<nums2[j]){
                    i++;
                }
                for(int k=m;k>i;k--){
                    nums1[k]=nums1[k-1];
                }
                nums1[i]=nums2[j];
                m++;
                j++;
                i++;
            }   
        }
    }
}