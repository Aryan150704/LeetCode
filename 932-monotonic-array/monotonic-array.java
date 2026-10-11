class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean a=true;
        boolean b=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                a=false;
                break;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                b=false;
                break;
            }
        }
        return a||b;
    }
}