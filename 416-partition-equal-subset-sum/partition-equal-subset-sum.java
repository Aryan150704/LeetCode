class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        Boolean[][] dp=new Boolean[nums.length][sum/2+1];
        return ss(nums,nums.length-1,sum/2,dp);
    }
    public boolean ss(int[] nums,int indc,int target,Boolean[][] dp){
        if(target==0)return true;
        if(indc==0)return target==nums[indc];
        if(dp[indc][target]!=null)return dp[indc][target];
        boolean take=target>=nums[indc]?ss(nums,indc-1,target-nums[indc],dp):false;
        boolean notTake=ss(nums,indc-1,target,dp);
        dp[indc][target]=take||notTake;
        return dp[indc][target];
    }
}