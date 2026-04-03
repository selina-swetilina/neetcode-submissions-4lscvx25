class MinStack {
    Stack<Long> s;
    long min;
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        long val2=1L*val;
        if(s.isEmpty()){
            min=val2;
            s.push(val2);
        }
        else{
            if(val2>=min){
                s.push(val2);
            } 
            else{
                long newval=2*val2-min;
                min=val;
                s.push(newval);
            }
        }
    }
    
    public void pop() {
        if(s.isEmpty()){
            return;
        }
        long x=s.peek();
        if(x<min){
            min=2*min-x;
            s.pop();
        }
        else{
            s.pop();
        }
    }
    
    public int top() {
        if(s.isEmpty()){
            return -1;
        }
        long t=0;
        if(s.peek()>=min){
            t=s.peek();
        }
        else{
            t=min;
        }
        int t1=(int)t;
        return t1;
    }
    
    public int getMin() {
        if(s.isEmpty()){
            return -1;
        }
        int min1=(int)min;
        return min1;
    }
}