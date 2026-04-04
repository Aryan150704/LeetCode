class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=matrix.length-1;
        int mid=0;
        int ansrow=right;
        while(left<right){
            mid=left+(right-left)/2;
            if(matrix[mid][0]==target)return true;
            if(matrix[mid][0]>target) right=mid-1;
            else{
                if(mid!=matrix.length-1 && matrix[mid+1][0]>target){
                    ansrow=mid;
                    break;
                }
                else{
                    left=mid+1;
                }
            }
        }
        if(left==right){
            ansrow=right;
        }
        System.out.println(ansrow);
        left=0;
        right=matrix[0].length-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(matrix[ansrow][mid]==target)return true;
            if(matrix[ansrow][mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}