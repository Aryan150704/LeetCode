class Solution {
    public int findMin(int[] nums) {
        int str=0;
        int end=nums.length-1;
        int mid=(str+end)/2;
        int lower=Integer.MAX_VALUE;
        while(str<=end){
            mid=(str+end)/2;

            if(nums[mid]>nums[nums.length-1]){
                str=mid+1;
            }
            else{
                end=mid-1;
                lower=nums[mid];
            }
        }
        return lower;
    }
}