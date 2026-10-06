class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=num;
            num=0;
            while(sum>0){
                num+=sum%10;
                sum=sum/10;
            }
        }
        return num;
    }
}