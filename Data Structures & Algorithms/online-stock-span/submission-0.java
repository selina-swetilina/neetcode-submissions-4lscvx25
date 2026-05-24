class StockSpanner {
    int count = 0;
    class Pair{
        int price;
        int index;
        Pair(int price, int index){
            this.price = price;
            this.index = index;
        }
    }
    Stack<Pair> s;
    public StockSpanner() {
        s = new Stack<>();
    }
    public int next(int price) {
        count++;
        if(s.size() == 0){
            s.push(new Pair(price, count));
            return 1;
        }       
        while(s.size() != 0 && s.peek().price <= price){
            s.pop();
        }
        if(s.size() == 0){
            s.push(new Pair(price, count));
            return count;
        }
        int ret = count - s.peek().index;
        s.push(new Pair(price, count));
        return ret;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */