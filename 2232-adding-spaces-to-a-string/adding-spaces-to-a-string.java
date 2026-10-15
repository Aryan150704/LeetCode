class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int k=0;
        int m=0;
        while(k<s.length()){
            if(m<spaces.length && k==(spaces[m])){
                sb.append(" ");
                m++;
            }
            else{
                sb.append(s.charAt(k));
                k++;
            }

        }
        return sb.toString();
    }
}