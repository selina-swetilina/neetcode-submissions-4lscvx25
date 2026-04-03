class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        for(int i=0;i<position.length;i++){
            for(int j=0;j<position.length-i-1;j++){
                if(position[j]<position[j+1]){
                    int temp=position[j];
                    position[j]=position[j+1];
                    position[j+1]=temp;
                    temp=speed[j];
                    speed[j]=speed[j+1];
                    speed[j+1]=temp;
                }
            }
        }
        double time[]=new double[position.length];
        for(int i=0;i<time.length;i++){
            time[i]=(target-position[i])/(double)speed[i];
        }
        Stack<Double> s=new Stack<>();
        for(int i=0;i<time.length;i++){
            if(s.isEmpty()){
                s.push(time[i]);
            }
            else{
                if(time[i]>s.peek()){
                    s.push(time[i]);
                }
                else{
                    continue;
                }
            }
        }
        return s.size();
    }
}