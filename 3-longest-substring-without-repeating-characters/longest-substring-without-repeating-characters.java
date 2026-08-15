class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        if(s.length()==1)return 1;
        Set<Integer> st=new HashSet<>();
        int ans=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            while(isContainDuplicate(left,right,s) ){
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
    public boolean isContainDuplicate(int j,int k,String s){
        Set<Character> hs =new HashSet<Character>();
        for(int i=j;i<=k;i++){
            if(hs.contains(s.charAt(i)))return true;
            else hs.add(s.charAt(i));
        }
        return false;
    }
}