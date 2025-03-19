class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]!=1){
                flipping(nums,i);
                count++;
            }
        }
        return (nums[nums.length - 1] == 1 && nums[nums.length - 2] == 1) ? count : -1;
    }
    public void flipping(int[] nums,int pos){
        nums[pos]^=1;
        nums[pos+1]^=1;
        nums[pos+2]^=1;
    }
}