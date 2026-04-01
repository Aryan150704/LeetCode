class Solution {
    public String reverseWords(String st) {
        ArrayList<String> arr=new ArrayList<String>();
        StringBuilder stb=new StringBuilder();
        int front=0;
        int back=st.length()-1;
        while(st.charAt(front)==' '){
            front++;
        }
        while(st.charAt(back)==' '){
            back--;
        }
        
        String s=st.substring(front,back+1);
        
        for(int i=0;i<s.length();i++){
           
            if(s.charAt(i)==' '){
                if(s.charAt(i-1)!=' '){
                    arr.add(stb.toString());
                stb.setLength(0);
                }
            }
            else{
                stb.append(s.charAt(i));
            }
        }
        arr.add(stb.toString());
        stb.setLength(0);
        System.out.print(arr.size());
        for(int i=arr.size()-1;i>=0;i--){
            stb.append(arr.get(i));
            if(i>0){ 
                stb.append(" ");
            }
        }
        return stb.toString();
    }
}