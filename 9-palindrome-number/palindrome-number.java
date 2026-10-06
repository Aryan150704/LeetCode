class Solution {
    public boolean isPalindrome(int n) {
        int before=n;
        int after =0;
        while(n>0){
            after=after*10+n%10;
            n=n/10;
        }
        return before==after;
    }
}