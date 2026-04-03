class Solution {
    public String longestPalindrome(String s) {
        String count=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String a=checklength(s,i,i);
            String b=checklength(s,i,i+1);
            if(a.length()>b.length()){
                if(a.length()>count.length()) count=a;
            }
            else{
                if(b.length()>count.length()) count=b;
            }
            System.out.println(count);
        }
        return count;
    }
    public static String checklength(String s,int left,int right){
        
       while( left>=0 && right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            else break;
        }
        return s.substring(left+1,right);
    }
    
}