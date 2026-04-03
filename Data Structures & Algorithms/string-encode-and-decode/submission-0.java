class Solution {

    public String encode(List<String> strs) {
        String ret="";
        int j=0;
        String num="";
        String str="";
        for(int i=0;i<strs.size();i++){
            str=strs.get(i);
            j=str.length();
            num=Integer.toString(j);
            ret=ret+j+'#'+str;
        }
        return ret;
    }

    public List<String> decode(String str) {
        ArrayList<String> list=new ArrayList<String>();
        String temp="";
        int j=0;
        int i=0;
        while(i<str.length()){
            while(str.charAt(i)!='#'){
                temp=temp+str.charAt(i);
                i++;
            }
            i++;
            j=Integer.parseInt(temp);
            temp="";
            for(int k=0;k<j;k++){
                temp=temp+str.charAt(i);
                i++;
            }
            list.add(temp);
            temp="";
        }
        return list;
    }
}
