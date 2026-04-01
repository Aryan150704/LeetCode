class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){   
            if(s.charAt(i)=='(')counter++;
            else counter--;
            if(s.charAt(i)==')'){
                if(counter>0){
                    st.append(s.charAt(i));
                }
            }
            else if(counter>1){
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}