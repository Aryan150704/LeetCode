class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> hm=new HashMap<>();
        Boolean vise=false;
        boolean versa=false;
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(hm.get(s.charAt(i))!=t.charAt(i))return false;
            }
        }
        vise=true;
        hm.clear();
        for(int i=0;i<t.length();i++){
            if(!hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i),s.charAt(i));
            }
            else{
                if(hm.get(t.charAt(i))!=s.charAt(i))return false;
            }
        }
        versa=true;
        return vise && versa;
    }
}