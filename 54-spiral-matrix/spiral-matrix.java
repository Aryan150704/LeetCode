class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=0;
        int c=0;
        int r1=matrix.length-1;
        int c1=matrix[0].length-1;
        List<Integer> arr=new ArrayList<>();
        while(r<=r1 && c<=c1){
            for(int i=c;i<=c1;i++){
                arr.add(matrix[r][i]);
            }
            for(int j=r+1;j<=r1;j++){
                arr.add(matrix[j][c1]);
            }
            if(r<r1 && c<c1){
                for(int x=c1-1;x>=c;x--){
                    arr.add(matrix[r1][x]);
                }
                for(int y=r1-1;y>r;y--){
                    arr.add(matrix[y][c]);
                }
            }
            r++;
            c++;
            r1--;
            c1--;
        }
        return arr;
    }
}