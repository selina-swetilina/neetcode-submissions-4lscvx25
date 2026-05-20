/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int start = 1;
        int end = n - 2;
        int mid = -1;
        int peek = -1;
        int now, prev, after = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            now = mountainArr.get(mid);
            prev = mountainArr.get(mid - 1);
            after = mountainArr.get(mid + 1);
            if(prev < now && now > after){
                peek = mid;
                break;
            }
            else if(prev < now && now < after){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        int temp = mountainArr.get(peek);
        if(temp == target){
            return peek;
        }
        start = 0;
        end = peek - 1;
        while(start <= end){
            mid = start + (end - start) / 2;
            temp = mountainArr.get(mid);
            if(temp == target){
                return mid;
            }
            else if(temp < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        start = peek + 1;
        end = n - 1;
        while(start <= end){
            mid = start + (end - start) / 2;
            temp = mountainArr.get(mid);
            if(temp == target){
                return mid;
            }
            else if(temp > target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}