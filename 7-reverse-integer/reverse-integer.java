class Solution {
    public int reverse(int x) {
        int n=0;
        boolean a=false;
        if(x<0){
            x=x*-1;
            a=true;
        }
        while(x>0){
            if(n>Integer.MAX_VALUE/10 || n<Integer.MIN_VALUE/10) return 0;
            n=n*10+x%10;
            x=x/10;
        }
        if(a)n=n*-1;
        return n;
    }
}