class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int answer[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(s.isEmpty()){
                s.push(i);
                answer[i]=0;
            }
            else{
                if(temperatures[s.peek()]>temperatures[i]){
                    answer[i]=s.peek()-i;
                    s.push(i);
                }
                else{
                    while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                        s.pop();
                    }
                    if(s.isEmpty()){
                        answer[i]=0;
                    }
                    else{
                        answer[i]=s.peek()-i;
                    }
                    s.push(i);   
                }
            }
        }
        return answer; 
    }
}