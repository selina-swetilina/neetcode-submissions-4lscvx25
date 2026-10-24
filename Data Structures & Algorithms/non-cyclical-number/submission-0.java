class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            int m = n;
            int sum = 0;
            while(m != 0){
                n = (m % 10) * (m % 10);
                sum = sum + n;
                m = m / 10;
            }
            n = sum;
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
        }
        return true;
    }
}