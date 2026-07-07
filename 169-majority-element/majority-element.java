class Solution {
    public int majorityElement(int[] nums) {
        int ans=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0 && ans!=nums[i]){
                ans=nums[i];
            }
            else if(ans==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
    }
}