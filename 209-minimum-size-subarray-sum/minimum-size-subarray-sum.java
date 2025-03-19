class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int str=0;
        int end=0;
        int sum=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>=target){
                count=end-str+1;
                min=Math.min(min,count);
                sum=sum-nums[str];
                str++;
            }
            end++;
        }
        if(min==Integer.MAX_VALUE)
        return 0;
        else
        return min;
    }
}