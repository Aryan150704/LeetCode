class Solution {
    
    public static int maxSubArray(int[] nums) {
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(maxSum<curr)maxSum=curr;
            if(curr<0) curr=0;
        }
        return maxSum;
    }
}