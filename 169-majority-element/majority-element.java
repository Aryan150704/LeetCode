class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        if(n==1) return nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                count=0;
            }
            else{
                count++;
            } 
            if(count>=n/2) return nums[i];
        }
        return -1;
    }
}