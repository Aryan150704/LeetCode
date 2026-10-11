class Solution {
    public int differenceOfSum(int[] nums) {
        int arrSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            arrSum+=nums[i];
            int k=nums[i];
            while(k>0){
                digitSum+=k%10;
                k=k/10;
            }
        }
        return arrSum-digitSum;
    }
}