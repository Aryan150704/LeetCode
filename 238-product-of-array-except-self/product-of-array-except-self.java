class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0;
        int[] arr=new int[nums.length];
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod=prod*nums[i];
            }
            else{
                zeroCount++;
            }
        }
        if(zeroCount>=2){
            for(int i=0;i<nums.length;i++){
                arr[i]=0;
            }
            return arr;
        }
        if(zeroCount==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) arr[i]=prod;
                else 
                arr[i]=0;
            }
            return arr;
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=prod/nums[i];
        }
        return arr;

    }
}