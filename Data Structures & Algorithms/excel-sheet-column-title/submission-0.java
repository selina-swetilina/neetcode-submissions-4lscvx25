class Solution {
    public String convertToTitle(int columnNumber) {
        columnNumber = columnNumber - 1;
        StringBuilder sb = new StringBuilder();
        while(columnNumber >= 0){
            int temp = columnNumber % 26;
            columnNumber = columnNumber / 26;
            columnNumber = columnNumber - 1;
            int temp2 = 65 + temp;
            sb.append((char)temp2); 
        }
        sb.reverse();
        String ret = sb.toString();
        return ret;
    }
}