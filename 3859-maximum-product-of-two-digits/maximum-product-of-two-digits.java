class Solution {
    public int maxProduct(int n) {
        int first=0;
        int sec=0;
        while(n>0){
            int k=n%10;
            n=n/10;
            if(k>first) {
                sec=first;
                first=k;
            }
            else if(k>sec) sec=k;
        }
        return sec*first;
    }
}