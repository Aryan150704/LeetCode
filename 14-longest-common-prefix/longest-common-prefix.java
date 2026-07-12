class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int k=0;
        while(k<strs[0].length()){
            if(strs[0].charAt(k)!=strs[strs.length-1].charAt(k)){
                return strs[0].substring(0,k);
            }
            k++;
        }
        return strs[0];
    }
}