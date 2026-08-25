class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            String bin=Integer.toBinaryString(c);
            while(bin.length()<8)bin="0"+bin;
            sb.append(bin);
        }
        String ans=sb.toString();
        for(int i=0;i<ans.length()/2;i++){
            if(ans.charAt(i)!=ans.charAt(ans.length()-i-1))return false;
        }
        return true;
    }
}