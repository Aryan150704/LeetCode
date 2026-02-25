class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long low=1;
        long high=x;
        int ans=-1;
        while(low<=high){
            long med=low+(high-low)/2;
            if(med*med<=x){
                low=med+1;
                ans=(int)med;
            }
            else high=med-1;
        }
        return ans;
    }
}