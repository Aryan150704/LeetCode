class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        if(n<=1)return nums[0];
        if(n<=2)return Math.max(nums[0],nums[1]);
        dp[1]=nums[0];
        dp[2]=Math.max(nums[0],nums[1]);
        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
            
        }
        return dp[n];
    }
}