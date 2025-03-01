class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
                i++;
            }   
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                if(i!=j)
                nums[i]=0;
                j++;
            }
        }
        return nums;
    }
}