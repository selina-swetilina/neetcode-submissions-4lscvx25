class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(s.isEmpty()){
                s.push(asteroids[i]);
            }
            else{
                int top=s.peek();
                int ele=Math.abs(asteroids[i]);
                if(top>0 && asteroids[i]<0){
                    if(ele==top){
                        s.pop();
                    }
                    else if(ele>top){
                        int check=0;
                        while(!s.isEmpty() && s.peek()>0 && s.peek()<ele){
                            s.pop();
                        }
                        if(!s.isEmpty() && s.peek()==ele){
                            s.pop();
                        }
                        else if(!s.isEmpty() && s.peek()>ele){}
                        else{
                            s.push(asteroids[i]);
                        }
                    }
                }
                else{
                    s.push(asteroids[i]);
                }
            }
        }
        int n=s.size();
        int ret[]=new int[n];
        if(n==0){
            return ret;
        }
        for(int i=n-1;i>=0;i--){
            ret[i]=s.pop();
        }
        return ret;
    }
}