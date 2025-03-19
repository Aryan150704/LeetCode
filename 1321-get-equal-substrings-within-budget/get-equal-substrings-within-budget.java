class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0,j=0;
        int cost=0;
        int max=Integer.MIN_VALUE;
        while(j<s.length()){
            cost+=Math.abs(s.charAt(j)-t.charAt(j));
            if(cost<=maxCost)max=Math.max(max, j-i+1);
            while(cost>maxCost){
                cost-=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            j++;
        }
         if(max==Integer.MIN_VALUE)return 0;
         else return max;
    }
}