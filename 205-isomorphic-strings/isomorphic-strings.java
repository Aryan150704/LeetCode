class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int arr[]=new int[256];
        int arr2[]=new int[256];
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            
            if(arr[ch1]!=arr2[ch2])return false;

            arr[ch1]=i+1;
            arr2[ch2]=i+1;
        }
        return true;
    }
}