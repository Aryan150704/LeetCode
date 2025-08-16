class Solution {
    public int maximum69Number (int num) {
        int val=0;
        if(num==6 || num==9) return 9;
        else if(num<100) val=2;
        else if(num<1000) val=3;
        else val=4;
        int neww=0;
        while(val>0){
            int ans=num;
            int a=(int)Math.pow(10,val-1);
            if(ans-7*a<neww+a){
                return num+a*3;
            }
            else neww+=a*9;
            val--;
        }
        return num;
    }
}