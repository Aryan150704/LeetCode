class Solution {
    public int[] buildArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}