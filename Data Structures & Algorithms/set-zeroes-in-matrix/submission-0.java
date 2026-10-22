class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        Iterator<Integer> it = row.iterator();
        while(it.hasNext()){
            int temp = it.next();
            for(int j = 0; j < n; j++){
                matrix[temp][j] = 0;
            }
        }
        Iterator<Integer> it2 = col.iterator();
        while(it2.hasNext()){
            int temp = it2.next();
            for(int i = 0; i < m; i++){
                matrix[i][temp] = 0;
            }
        }
    }
}