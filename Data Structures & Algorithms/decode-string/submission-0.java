class Solution {
    class Result{
        StringBuilder sbResult;
        int iResult;
    }
    Result decoder(StringBuilder temp , String str){
        Result ret = new Result();
        StringBuilder sb = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        int i=0;
        while(str.charAt(i) != ']'){
            if(str.charAt(i) == '['){
                Result ans=decoder(new StringBuilder(temp2),str.substring(i+1,str.length()));
                temp2.delete(0,temp2.length());
                temp2.append(ans.sbResult);
                i=i+ans.iResult+2;
            }
            else{
                temp2.append(str.charAt(i));
                i++;
            }
        }
        boolean isValid = false;
        int num=0;
        while(isValid == false){
            try{
                num = Integer.parseInt(temp.toString());
                isValid = true;
            }
            catch(NumberFormatException e){
                isValid = false;
                sb.append(temp.charAt(0));
                temp.delete(0,1);
            }
        }
        for(int j = 0;j < num;j++){
            sb.append(temp2);
        }
        ret.sbResult = sb;
        ret.iResult = i;
        return ret;
    }
    public String decodeString(String s) {
        int i=0;
        StringBuilder temp = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        while(i < s.length()){
            if(s.charAt(i) == '['){
                Result ans=decoder(temp,s.substring(i+1,s.length()));
                sb.append(ans.sbResult);
                i=i+ans.iResult+2;
                temp.delete(0,temp.length());
            }
            else{
                temp.append(s.charAt(i));
                i++;
            }
        }
        sb.append(temp);
        String strRet = sb.toString();
        return strRet;
    }
}