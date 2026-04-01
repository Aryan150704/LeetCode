class Solution {
    public boolean rotateString(String s, String goal) {
        String ans=s+s;
        return ans.contains(goal) && s.length()==goal.length();
    }
}