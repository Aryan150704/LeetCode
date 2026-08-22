class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos=-1;
        int lastPos=-1;
        if(nums.length==0)return new int[]{firstPos,lastPos};
        // finding first
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                firstPos=mid;
                if(mid!=0 && nums[mid-1]==nums[mid]){
                    high=mid-1;
                }
                else break;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        //finding last
        low=0;
        high=nums.length-1;
        while(low<=high){
        int mid=low+(high-low)/2;
            if(nums[mid]==target){
                lastPos=mid;
                if(mid!=nums.length-1 && nums[mid+1]==nums[mid]){
                    low=mid+1;
                }
                else break;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return new int[]{firstPos,lastPos};
    }
}