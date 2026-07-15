class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        String k="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                k+=" ";
                while(s.charAt(i)==' '){
                    i++;
                }
            }
            k+=s.charAt(i);
        }
        s=k;
        k="";
        String[] nums=s.split(" ");
        for(int i=0;i<nums.length/2;i++){
            String temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-1-i]=temp;
        }
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                k+=nums[i];
                return k;
            }
            k+=nums[i]+" ";
        }
        
        return "";
    }
}