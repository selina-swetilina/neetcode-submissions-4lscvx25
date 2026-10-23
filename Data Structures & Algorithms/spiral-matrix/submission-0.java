class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int mu = matrix.length - 1 ;
        int ml = 0;
        int nu = matrix[0].length - 1;
        int num = matrix.length * matrix[0].length;
        int count = 0;
        int nl = 0;
        int i = 0;
        int j = 0;
        while(count < num){
            j = nl;
            while(count < num && j <= nu){
                list.add(matrix[ml][j]);
                count++;
                j++;
            }
            if(count >= num){
                break;
            }
            j--;
            ml++;
            i = ml;
            while(count < num && i <= mu){
                list.add(matrix[i][nu]);
                count++;
                i++;
            }
            if(count >= num){
                break;
            }
            nu--;
            i--;
            j = nu;
            while(count < num && j>= nl){
                list.add(matrix[mu][j]);
                count++;
                j--;
            }
            if(count >= num){
                break;
            }
            j++;
            mu--;
            i = mu;
            while(count < num && i >= ml){
                list.add(matrix[i][nl]);
                count++;
                i--;
            }
            if(count >= num){
                break;
            }
            nl++;
            i++;
        }
        return list;
    }
}