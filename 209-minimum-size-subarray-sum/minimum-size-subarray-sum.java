class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int ans=Integer.MAX_VALUE;
        int curr=0;
        while(right<nums.length){
            curr+=nums[right];
            while(curr>=target){
                ans=Math.min(ans,right-left+1);
                curr-=nums[left];
                left++;
            }
            right++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}