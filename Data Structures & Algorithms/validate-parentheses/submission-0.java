class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ch.push('(');
            }
            else if(s.charAt(i)==')'){
                if(ch.isEmpty()){
                    return false;
                }
                int top=ch.peek();
                if(top=='('){
                    ch.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='{'){
                ch.push('{');
            }
            else if(s.charAt(i)=='}'){
                if(ch.isEmpty()){
                    return false;
                }
                int top=ch.peek();
                if(top=='{'){
                    ch.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='['){
                ch.push('[');
            }
            else if(s.charAt(i)==']'){
                if(ch.isEmpty()){
                    return false;
                }
                int top=ch.peek();
                if(top=='['){
                    ch.pop();
                }
                else{
                    return false;
                }
            } 
        }
        if(!ch.isEmpty()){
            return false;
        }
        return true;
    }
}