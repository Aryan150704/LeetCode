class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        boolean[] dp = new boolean[sum/2+1];
        dp[0] = true;
        for (int x : nums)
            for (int t = sum/2; t >= x; t--)
                dp[t] |= dp[t-x];
        return dp[sum/2];
    }
}