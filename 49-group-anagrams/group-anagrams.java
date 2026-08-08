class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lis=new ArrayList<>();
        Set<String> st=new HashSet<>();
        for(int i=0;i<strs.length;i++){
            char[] ans=strs[i].toCharArray();
            Arrays.sort(ans);
            if(st.contains(String.valueOf(ans))) continue;
            st.add(String.valueOf(ans));
            Set<String> st2=new HashSet<>();
            st2.add(String.valueOf(ans));
            List<String> ll=new ArrayList<>();
            ll.add(strs[i]);

            for(int j=0;j<strs.length;j++){
                if(i==j || strs[i].length()!=strs[j].length())continue;
                char[] a=strs[j].toCharArray();
                Arrays.sort(a);
                if(st2.contains(String.valueOf(a))){
                    ll.add(strs[j]);
                }
            }
            lis.add(ll);
        }
        return lis;
    }
}