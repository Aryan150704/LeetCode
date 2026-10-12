class Solution {
    public int thirdMax(int[] nums) {
        long firstMax=Long.MIN_VALUE;
        long secMax=Long.MIN_VALUE;
        long thiMax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=firstMax){
                if(nums[i]==firstMax)continue;
                thiMax=secMax;
                secMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>=secMax){
                if(nums[i]==secMax)continue;
                thiMax=secMax;
                secMax=nums[i];
            }
            else if(nums[i]>thiMax){
                if(nums[i]==thiMax)continue;
                thiMax=nums[i];
            }
            System.out.println(firstMax+" "+secMax+" "+thiMax);
        }
        if(thiMax==Long.MIN_VALUE)return (int)Math.max(firstMax,secMax);
        return (int)thiMax;
    }
}