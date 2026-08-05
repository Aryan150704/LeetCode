class Solution {
    public int[] transformArray(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)count++;
        }
        //System.out.println(count);
        for(int i=0;i<nums.length;i++){
            if(i>=count)nums[i]=1;
            else nums[i]=0;
        }
        return nums;
    }
}