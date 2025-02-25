class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isfirstrow = false;
        boolean isfirstcolumn =false ;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                isfirstrow=true;
                break;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                isfirstcolumn=true;
                break;
            }
        }
        for(int x=1;x<matrix.length;x++){
            for(int y=1;y<matrix[0].length;y++){
                if(matrix[x][y]==0){
                    matrix[x][0]=0;
                    matrix[0][y]=0;
                }
            }
        }
        for(int a=1;a<matrix.length;a++){
            if(matrix[a][0]==0){
                for(int l=0;l<matrix[0].length;l++){
                    matrix[a][l]=0;
                }
            }
        }
        for(int b=0;b<matrix[0].length;b++){
            if(matrix[0][b]==0){
                for(int m=0;m<matrix.length;m++){
                    matrix[m][b]=0;
                }
            }
        }
        if(isfirstrow){
            for(int f=0;f<matrix[0].length;f++){
                matrix[0][f]=0;
            }
        }
        if(isfirstcolumn){
            for(int g=0;g<matrix.length;g++){
                matrix[g][0]=0;
            }
        }
        
    }
}