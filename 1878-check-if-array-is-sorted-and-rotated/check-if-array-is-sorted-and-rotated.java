class Solution {
    public boolean check(int[] nums) {
        if(nums[0]>=nums[nums.length-1]){
            int count=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[i-1])count++;
            }
            if(nums[0]==nums[nums.length-1] && count==0)return true;
            return count==1;
        }
        else{
            for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[i-1])return false;
            }
        }
        return true;
    }
}