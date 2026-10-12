class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int k=nums[i];
            while(k>0){
                sum+=k%10;
                k=k/10;
            }
            if(i==sum)return i;
        }
        return -1;
    }
}