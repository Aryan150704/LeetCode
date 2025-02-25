class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int r=0;
        int c=0;
        int r1=arr.length-1;
        int c1=arr[0].length-1;
        int count=1;
        while(r<=r1 && c<=c1){
            for(int i=c;i<=c1;i++){
                arr[r][i]=count++;
            }
            for(int j=r+1;j<=r1;j++){
                arr[j][c1]=count++;
            }
            if(r<r1 && c<c1){
                for(int k=c1-1;k>=c;k--){
                arr[r1][k]=count++;
            }
            for(int l=r1-1;l>r;l--){
                arr[l][c]=count++;
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