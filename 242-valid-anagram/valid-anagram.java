class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i),1);
            }
            else{
                hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
            }
            if(!hm2.containsKey(t.charAt(i))){
                hm2.put(t.charAt(i),1);
            }
            else{
                hm2.put(t.charAt(i),hm2.get(t.charAt(i))+1);
            }
        }
        return hm1.equals(hm2);
    }
}