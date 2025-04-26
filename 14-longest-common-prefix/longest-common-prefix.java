class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common=strs[0];
        for (int i = 1; i < strs.length; i++) {
            common = matched(common, strs[i]);
        }
        return common;
    }
    String matched(String common,String current){
        for(int i=0;i<Math.min(common.length(),current.length());i++){
            if(common.charAt(i)!=current.charAt(i))
            return common.substring(0,i);
        }
        return common.length() < current.length() ? common : current;
    }
}