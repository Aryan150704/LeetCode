class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        long sum=0;
        while(n>0){
            if(n%10==0){
                n=n/10;
            }
            else{
                ans=ans*10+n%10;
                sum+=n%10;
                n=n/10;

            }
        }
        long k=0;
        while(ans>0){
            k=k*10+ans%10;
            ans=ans/10;
        }
        return k*sum;
    }
}