class Solution {
    public String multiply(String num1, String num2) {

        int l1 = num1.length();
        int l2 = num2.length();
        int count = 0;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i = l2 - 1; i >= 0; i--){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int n = num2.charAt(i) - '0';
            int temp = 0;
            int e = 0;
            for(int j = l1 - 1; j >= 0; j--){
                int temp2 = (num1.charAt(j) - '0') * n + e;
                int temp3 = temp2 % 10;  
                list.add(temp3);
                e = temp2 / 10;
            }
            if(e != 0){
                list.add(e);
            }
            for( int b = 1; b <= count; b++){
                list.add(0,0);
            }
            count++;
            if(ret.size() == 0){
                for(int a = list.size() - 1; a >= 0; a--){
                    ret.add(list.get(a));
                }
            }
            else{
                int n3 = 0;
                int j = 0;
                int k = ret.size() - 1;
                while(j < list.size()  && k >= 0){
                    int n1 = ret.get(k) + list.get(j) + n3;
                    int n2 = n1 % 10;
                    n3 = n1 / 10;
                    ret.set(k, n2);
                    j++;
                    k--;
                }
                if(j == list.size() && k >= 0){
                    while(k >= 0){
                        int n4 = ret.get(k) + n3;
                        int n5 = n4 % 10;
                        n3 = n4 / 10;
                        ret.set(k, n5);
                        k--;
                    }
                }
                if(j < list.size() && k < 0){
                    while(j < list.size()){
                        int n4 = list.get(j) + n3;
                        int n5 = n4 % 10;
                        n3 = n4 / 10;
                        ret.add(0, n5);
                        j++;
                    }
                }
                if(n3 != 0){
                    ret.add(0,n3);
                }
            }
        }
        if(ret.get(0) == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : ret){
            sb.append(digit);
        }
        String strret = sb.toString();
        return strret;
    }
}