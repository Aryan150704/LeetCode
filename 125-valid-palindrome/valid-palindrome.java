class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
           
            if((s.charAt(i)-'A'<=25 && s.charAt(i)-'A'>=0 )|| (s.charAt(i)-'a'<=25 && s.charAt(i)-'a'>=0 ) ||(s.charAt(i)-'0'<=9 && s.charAt(i)-'0'>=0 )){
                ans.append(s.charAt(i));
            }
        }
        int i=0;
        int j=ans.length()-1;

        System.out.print(ans);
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}