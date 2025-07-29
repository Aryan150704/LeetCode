class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;
        while(mid<=end){
            if(nums[mid]==2){
                swipee(mid,end,nums);
                end--;
            }
            else if(nums[mid]==0){
                swipee(mid,start,nums);
                mid++;
                start++;
            }
            else{
                mid++;
            }
        }
    }
    public static void swipee(int i, int j, int[] arr){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}