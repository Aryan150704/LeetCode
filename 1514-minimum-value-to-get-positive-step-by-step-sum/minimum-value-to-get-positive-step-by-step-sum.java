class Solution {
    public int minStartValue(int[] nums) {
        int startvalue=1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[0]<1){
                startvalue=1-nums[0];
                }
            }
            else{
                nums[i]+=nums[i-1];
            if(nums[i]+startvalue<1){
                startvalue+=1-(nums[i]+startvalue);
            }
            }
        }
        return startvalue;
    }
}