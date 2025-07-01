class Solution {
    public int possibleStringCount(String word) {
        int ans=1;
        int i=0;
        int count=word.length()-1;
        while(count>0){
            if(word.charAt(i)==word.charAt(i+1)) ans++;
            count--;
            i++;
        }
        return ans;
    }
}