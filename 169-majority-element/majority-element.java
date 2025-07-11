class Solution {
    public int majorityElement(int[] nums) {
        int curr=0;
        int ans=Integer.MIN_VALUE;
        for(int num : nums){
            if(curr==0 && ans!=num) ans=num;
            else{
                if(num==ans) curr++;
                else curr--;
            }
        }
        return ans;
    }
}