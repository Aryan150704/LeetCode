class Solution {
    public int searchInsert(int[] nums, int target) {
        int first=0;
        int last=nums.length-1;
        int mid=first+(last-first)/2;
        while(first<=last){
            mid=first+(last-first)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target)last=mid-1;
            else first=mid+1;
        }
        return first;
    }
}
