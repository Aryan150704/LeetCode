class Solution {
    public int triangularSum(int[] nums) {
        int k=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<k-1-i;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }
        return nums[0] ;
    }
}