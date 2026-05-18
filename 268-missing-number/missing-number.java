class Solution {
    public int missingNumber(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        boolean zero=false;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]==0)zero=true;
            max=Math.max(max,nums[i]);
        }
        if(!zero)return 0;
        int sum2=0;
        for(int i=0;i<=max;i++){
            sum2+=i;
        }
        if(sum==sum2)return max+1;
        return sum2-sum;
    }
}