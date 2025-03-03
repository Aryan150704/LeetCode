class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int current=0;
        for(int i=0;i<nums.length;i++){
            if(pivot>nums[i]){
            arr[current]=nums[i];
            current++;
        }
        }
        for(int i=0;i<nums.length;i++){
            if(pivot==nums[i]){
            arr[current]=nums[i];
            current++;
        }
        }
        for(int i=0;i<nums.length;i++){
            if(pivot<nums[i]){
            arr[current]=nums[i];
            current++;
        }
        }
        return arr;
    }
}