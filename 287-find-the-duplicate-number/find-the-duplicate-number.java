class Solution {
    public int findDuplicate(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int[] arr=new int[max+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1)return i;
        }
        return -1;
    }
}