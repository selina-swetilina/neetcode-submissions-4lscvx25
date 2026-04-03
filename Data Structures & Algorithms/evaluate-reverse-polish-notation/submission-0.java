class Solution {
    public int evalRPN(String[] tokens) {
        int ret=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int x=s.pop();
                int y=s.pop();
                ret=y+x;
                s.push(ret);
            }
            else if(tokens[i].equals("-")){
                int x=s.pop();
                int y=s.pop();
                ret=y-x;
                s.push(ret);
            }
            else if(tokens[i].equals("*")){
                int x=s.pop();
                int y=s.pop();
                ret=y*x;
                s.push(ret);
            }
            else if(tokens[i].equals("/")){
                int x=s.pop();
                int y=s.pop();
                ret=y/x;
                s.push(ret);
            }
            else{
                int temp=Integer.parseInt(tokens[i]);
                s.push(temp);
            }
        }
        ret=s.pop();
        return ret;
    }
}