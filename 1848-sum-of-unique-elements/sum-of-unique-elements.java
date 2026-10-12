class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}