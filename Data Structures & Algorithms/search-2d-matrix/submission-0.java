class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length- 1;
        int mid = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(target == matrix[mid][0]){
                return true;
            }
            else if(target < matrix[mid][0]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        int m = end;
        if(m == -1){
            return false;
        }
        start = 0;
        end = matrix[0].length - 1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(target < matrix[m][mid]){
                end = mid - 1;
            }
            else if(target > matrix[m][mid]){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}