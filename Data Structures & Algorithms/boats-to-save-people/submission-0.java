class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ret=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(i==j){
                ret++;
                break;
            }
            if(people[i]+people[j]<=limit){
                ret++;
                i++;
                j--;
            }
            else{
                ret++;
                j--;
            }
        }
        return ret;
    }
}