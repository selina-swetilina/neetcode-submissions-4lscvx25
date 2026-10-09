class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        long m = n;
        if( n < 0 ){
            m = -m;
        }
        double ret = x;
        long i = 1;
        while(i <= m/2){
            ret = ret * ret;
            i = i * 2;
        }
        long j = m - i;
        if(i - j < j){
            double temp = ret;
            for(int k = 1; k<= (i- j); k++){
                temp = temp / x;
            }
            ret = ret * temp;
        }
        else{
            for(long k = 1; k <= j; k++){
                ret = ret * x;
            }
        }
        if(n < 0){
            ret = 1 / ret;
        }
        return ret;
    }
}