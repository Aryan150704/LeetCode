class Solution {
    public int tribonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        int prev=1;
        int secPrev=1;
        int thiPrev=0;
        for(int i=2;i<n;i++){
            int temp=prev+secPrev+thiPrev;
            thiPrev=secPrev;
            secPrev=prev;
            prev=temp;
        } 
        return prev;
    }
}