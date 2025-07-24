class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
                ans=Math.max(ans,curr);
            }
            else curr=0;
        }
        return ans;
    }
}