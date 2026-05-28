class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            String st=strs[i];
            if(st.chars().anyMatch(Character::isLetter)){
                max=Math.max(max,st.length());
            }
            else max=Math.max(max,Integer.parseInt(st));
        }
        return max;
    }
}