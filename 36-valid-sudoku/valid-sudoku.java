class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!hs.add(board[i][j]+"in row"+i))return false;
                if(!hs.add(board[i][j]+"in col"+j))return false;
                if(!hs.add(board[i][j]+"in row and col"+i/3+j/3))return false;
                // in case of !hs.add it will add then check so no need to add again
            }
        }
        return true;
    }
}