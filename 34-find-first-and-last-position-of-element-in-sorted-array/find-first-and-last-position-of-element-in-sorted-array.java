class Solution {
    public void finding(int[] nums,int mid,int[] arr){
        int first=mid;
        int last=mid;
        while(first>=0 && arr[first]==arr[mid]){
            first--;
        }
         while(last<arr.length && arr[last]==arr[mid]){
            last++;
        }
        nums[0]=first+1;
        nums[1]=last-1;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int[] arr=new int[2];
        if(nums.length==1 && target==nums[0]) {
            arr[0]=0;
            arr[1]=0;
            return arr;
        }
           
        arr[0]=-1;
        arr[1]=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
             finding(arr,mid, nums);
             break;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return arr;
    }
}