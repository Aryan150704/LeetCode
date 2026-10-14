class Solution {
    public String reverseWords(String s) {
        String[] st=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<st.length;i++){
            StringBuilder sb=new StringBuilder(st[i]).reverse();
            ans.append(sb);
            if(i!=st.length-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}