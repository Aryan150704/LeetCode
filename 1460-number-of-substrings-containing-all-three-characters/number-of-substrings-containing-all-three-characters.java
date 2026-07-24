class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int a=0;
        int b=0;
        int c=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')a++;
            else if(s.charAt(i)=='b')b++;
            else c++;
            if(a>0 && b>0 && c>0){
                while(a>0 && b>0 && c>0){
                    ans+=s.length()-i;
                    if(s.charAt(k)=='a')a--;
                    else if(s.charAt(k)=='b')b--;
                    else c--;
                    k++;
                }
            }
        }
        return ans;
    }
}