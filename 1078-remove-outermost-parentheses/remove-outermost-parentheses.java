class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){   
            if(s.charAt(i)=='(')counter++;
            else counter--;
            if(counter>=2 || counter>=1 && s.charAt(i)==')'){
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}