class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int merge[][]=new int[position.length][2];
        for(int i=0;i<position.length;i++){
            merge[i][0]=position[i];
            merge[i][1]=speed[i];
        }
        Arrays.sort(merge,(a,b)->b[0]-a[0]);
        Stack<Double> s=new Stack<>();
        for(int i=0;i<merge.length;i++){
            double time=(target-merge[i][0])/(double)merge[i][1];
            if(s.isEmpty()){
                s.push(time);
            }
            else{
                if(time>s.peek()){
                    s.push(time);
                }
                else{
                    continue;
                }
            }
        }
        return s.size();
    }
}