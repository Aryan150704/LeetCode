class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){

            }
            else if(nums[i]<=99){
                count++;
            }
            else if(nums[i]<=999){

            }
            else if(nums[i]<=9999)
            count++;
            else if(nums[i]==100000)
            count++;
            else{

            }
        }
        return count;
    }
}