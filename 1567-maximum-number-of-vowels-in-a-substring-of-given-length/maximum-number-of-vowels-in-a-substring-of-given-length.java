class Solution {
    public boolean isvowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        int str=0;
        int end=k;
        while(end<s.length()){
            if(isvowel(s.charAt(str))){
                count--;
            }
            if(isvowel(s.charAt(end))){
                count++;
            }
            max=Math.max(max,count);
            str++;
            end++;
        }
        return max;
    }
}