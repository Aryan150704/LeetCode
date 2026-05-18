class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                zero++;
                continue;
            }
            pro*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(zero>1){
                nums[i]=0;
            }
            else if(zero>0){
                if(nums[i]==0) nums[i]=pro;
                else nums[i]=0;
            }
            else if(nums[i]==0) nums[i]=pro;
            else nums[i]=pro/nums[i];
        }
        return nums;
    }
}