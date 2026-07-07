class Solution {
    public int maxProfit(int[] nums) {
        int ans=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            else{
                int diff=nums[i]-min;
                if(diff>ans)
                ans=diff;
            }
        }
        return ans;
    }
}
/*
7 1 5 3 6 4
min -> 1
ans -> 4
*/ 