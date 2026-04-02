class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
        int m=0;
        int sign=1;
        if(s.charAt(m)=='-' || s.charAt(m)=='+'){
            if(s.charAt(m)=='-')
            sign=-1;
            else sign=1;
            m++;
        }
        while(m<s.length() && s.charAt(m)=='0' ){
            m++;
        }
        
        long ans=0;
        while(m<s.length()){
            long num=s.charAt(m)-'0';
            if((num<0 || num >9 )) break;
            ans=ans*10+num;

            if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
                if(sign ==-1) return Integer.MIN_VALUE;
                else  return Integer.MAX_VALUE;
            }
                

            m++;
        }
        return (int)ans *sign;
    }
}