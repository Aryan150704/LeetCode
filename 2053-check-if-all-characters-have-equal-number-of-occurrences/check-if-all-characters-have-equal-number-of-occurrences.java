class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(k==0)k=arr[i];
                else if(k!=arr[i]) return false;
            }
        }
        return true;
    }
}