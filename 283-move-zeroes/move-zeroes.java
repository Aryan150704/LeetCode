class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==0)i++;
            else {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                i++;
            }
        }
    }
}