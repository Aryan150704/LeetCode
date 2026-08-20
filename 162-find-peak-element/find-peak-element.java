class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        else if(nums[0]>nums[1])return 0;
        else if(nums[nums.length-1]>nums[nums.length-2])return nums.length-1;
        int first=1;
        int last=nums.length-2;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(mid!=0 && mid!=nums.length-1 && nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid])return mid;
            else if(nums[mid-1]>nums[mid])last=mid-1;
            else first=mid+1;
        }
        return -1;
    }
}