class Solution {
    public int partitionDisjoint(int[] nums) {
        int leftMax=nums[0];
        int currentMax=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            currentMax=Math.max(currentMax,nums[i]);
            if(nums[i]<leftMax){
                leftMax=currentMax;
                index=i;
            }
        }
        return index+1;
    }
}