class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        if(k>nums.length)
        k=k%nums.length;
        r(nums,0,n);
        r(nums,0,k-1);
        r(nums,k,n);
    }
    public void r(int[] arr,int str,int end){
        while(str<end){
            int temp=arr[str];
            arr[str]=arr[end];
            arr[end]=temp;
            str++;
            end--;
        }
    }
}