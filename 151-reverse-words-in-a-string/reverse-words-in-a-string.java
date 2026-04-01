class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder std=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            
            std.append(words[i]);
            if(i>0)
            std.append(" ");
        }
        return std.toString();
    }
}