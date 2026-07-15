class Solution {
    public String removeOuterParentheses(String s) {
        int n=-1;
        StringBuilder k=new StringBuilder();
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='(') n++;
            else n--;
            
            if(s.charAt(i)=='(' && n==0 || s.charAt(i)==')' && n==-1){
                continue;
            }
            else{
                k.append(s.charAt(i));
            }
           
            
        }
        return k.toString();
    }
}