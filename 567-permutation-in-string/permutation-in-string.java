class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int l=0;
        int[] s1Alp=new int[26];
        int[] s2Alp=new int[26];
        for(int i=0;i<s1.length();i++){
            s1Alp[s1.charAt(i)-'a']+=1;
            s2Alp[s2.charAt(i)-'a']+=1;
        }
        if(Arrays.equals(s1Alp,s2Alp))return true;
        for(int r=s1.length();r<s2.length();r++){
            s2Alp[s2.charAt(r)-'a']+=1;
            s2Alp[s2.charAt(l++)-'a']-=1;
            if(Arrays.equals(s1Alp,s2Alp))return true;
        }
        return false;
    }
}