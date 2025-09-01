class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int ans=0;
        for(int i: prices){
            buy=Math.min(buy,i);
            if(buy<i){
                ans=Math.max(ans,i-buy);
            }
        }
        return ans;
    }
}