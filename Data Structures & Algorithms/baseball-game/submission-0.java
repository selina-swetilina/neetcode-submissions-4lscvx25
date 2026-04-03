class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top1=s.pop();
                int top2=s.peek();
                s.push(top1);
                s.push(top1+top2);
            }
            else if(operations[i].equals("D")){
                int top=s.peek();
                s.push(top*2);
            }
            else if(operations[i].equals("C")){
                s.pop();
            }
            else{
               int score=Integer.parseInt(operations[i]);
               s.push(score); 
            }
        }
        int sum=0;
        while(!s.isEmpty()){
            sum=sum+s.peek();
            s.pop();
        }
        return sum;
    }
}