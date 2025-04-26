class Solution {
    public String shiftingLetters(String str, int[] shifts) {
        char[] s=str.toCharArray();
        int shift=0;
        for(int i=shifts.length-1;i>=0;i--){
            shift=(shifts[i]+shift)%26;
            s[i]=(char)((s[i]-'a'+shift)%26+'a');
        }
        return new String(s);
    }
}