class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int ans=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            ans=Math.max(ans,currentSum);
            if(currentSum<0)currentSum=0;
        }
        return ans;
    }
}