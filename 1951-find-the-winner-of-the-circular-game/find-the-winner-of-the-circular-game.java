class Solution {
    public int fxn(int n,int k){
        if(n==1)
        return 0;
        return (fxn(n-1,k)+k)%n;
    }
    public int findTheWinner(int n, int k) {
        return fxn(n,k)+1;       
    }
}