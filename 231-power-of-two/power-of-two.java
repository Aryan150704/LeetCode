class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>=0 && Integer.bitCount(n)==1)return true;
        return false;
    }
}