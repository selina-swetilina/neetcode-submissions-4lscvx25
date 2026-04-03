class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>set=new HashSet<>();
        //to check row
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    else{
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear();
        }

        //to check colummns
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                else{
                    if(set.contains(board[j][i])){
                        return false;
                    }
                    else{
                        set.add(board[j][i]);
                    }
                }
            }
            set.clear();
        }

        //to cheak each 3X3 box
        for(int r=0;r<9;r+=3){
            for(int c=0;c<9;c+=3){
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(board[r+i][c+j]=='.'){
                            continue;
                        }
                        else{
                            if(set.contains(board[r+i][c+j])){
                                return false;
                            }
                            else{
                                set.add(board[r+i][c+j]);
                            }
                        }
                    }
                }
                set.clear();
            }
        }        
        return true;
    }
}