class Solution {
    public String largestOddNumber(String num) {
        int k=num.length();
        while(k>0){
            
            if(num.charAt(k-1)%2!=0)return num.substring(0,k);
            k--;
        }
        return "";
        }
}