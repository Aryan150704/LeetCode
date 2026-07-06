class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rot(nums,0,nums.length-1);
        rot(nums,0,k-1);
        rot(nums,k,nums.length-1);
    }
    public void rot(int[] arr,int str,int end){
        while(str<=end){
            int temp=arr[str];
            arr[str]=arr[end];
            arr[end]=temp;
            str++;
            end--;
        }
    }
}