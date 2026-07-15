class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)return 0;
        int k=0;
        boolean isNeg=false;
        StringBuilder ss=new StringBuilder();
        while(k<s.length() && s.charAt(k)==' '){
            k++;
        }
        if(k<s.length() && (s.charAt(k)=='+' || s.charAt(k)=='-')){
            if(s.charAt(k)=='-') isNeg=true;
            k++;
        }
        
        while(k<s.length() && s.charAt(k)-'0'<10 && s.charAt(k)-'0'>=0){
            ss.append(s.charAt(k));
            k++;
        }
        s=ss.toString();

        k=0;
        long ans=0;
        while(k<s.length()){
            ans=ans*10+s.charAt(k)-'0';
            k++;
            if (!isNeg && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (isNeg && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        if(isNeg)return (int)ans*-1;
        return (int)ans;
    }
}