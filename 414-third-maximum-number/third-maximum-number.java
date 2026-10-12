class Solution {
    public int thirdMax(int[] nums) {
        long firstMax=Long.MIN_VALUE;
        long secMax=Long.MIN_VALUE;
        long thiMax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==firstMax || nums[i]==secMax ||nums[i]==thiMax)continue;
            if(nums[i]>=firstMax){
                thiMax=secMax;
                secMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>=secMax){
                thiMax=secMax;
                secMax=nums[i];
            }
            else if(nums[i]>thiMax){
                thiMax=nums[i];
            }
        }
        if(thiMax==Long.MIN_VALUE)return (int)Math.max(firstMax,secMax);
        return (int)thiMax;
    }
}