class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String str = "";
        for(int i = 0 ; i < path.length() ; i++){
            if(path.charAt(i)=='/'){
                if(str.equals("")){}
                else if(str.equals(".")){
                    str="";
                }
                else if(str.equals("..")){
                    if(!s.isEmpty()){
                        s.pop();
                    }
                    str="";
                }
                else{
                    s.push(str);
                    str="";
                }
            }
            else{
                str=str+path.charAt(i);
            }
        }
        if(!str.equals("") && !str.equals(".") && !str.equals("..")){
            s.push(str);
        }
        if(!s.isEmpty() && str.equals("..")){
            s.pop();
        }
        String ret="";
        Stack<String> s2 = new Stack<>();
        while(!s.isEmpty()){
            s2.push(s.peek());
            s.pop();
        }
        if(s2.isEmpty()){
            ret="/";
        }
        else{
            while(!s2.isEmpty()){
                ret=ret+"/"+s2.peek();
                s2.pop();
            }
        }
        return ret;
    }
}