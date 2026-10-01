class Solution {
    public boolean isValid(String s) {
        char[] ans=s.toCharArray();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<ans.length;i++){
            if(ans[i]=='('||ans[i]=='{'||ans[i]=='['){
                stk.push(ans[i]);
            }
            else if(!stk.isEmpty() && (ans[i]==')' && stk.peek()=='('||ans[i]=='}' && stk.peek()=='{'||ans[i]==']' && stk.peek()=='[')){
                stk.pop();
            }
            else {
                return false;
            }
        }
        return stk.size()==0;
    }
}