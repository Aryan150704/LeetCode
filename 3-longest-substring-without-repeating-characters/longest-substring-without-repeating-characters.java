class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count=new int[128];
        int r=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            while(count[s.charAt(i)]>1)
                count[s.charAt(r++)]--;
            max=Math.max(max,i-r+1);
        }
    return max;
    }

}