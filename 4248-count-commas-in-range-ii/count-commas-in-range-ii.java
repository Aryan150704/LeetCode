class Solution {
    public long countCommas(long n) {
        long ans=0;
        long p=1000;
        while(n>=p){
            ans+=n-p+1;
            if(p>n/1000)break;
            else p=p*1000;
        }
        return ans;
    }
}