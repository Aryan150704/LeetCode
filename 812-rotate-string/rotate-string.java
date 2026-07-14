class Solution {
    public boolean rotateString(String s, String goal) {
        String a=s+s;
        return s.length()==goal.length() && a.contains(goal);
    }
}