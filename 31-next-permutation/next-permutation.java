class Solution {
    public void nextPermutation(int[] nums) {
        int i=0;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){

                break;
            }
        }
        
        if(i>=0){
            for(int j=nums.length-1;j>=0;j--){
                if(nums[i]<nums[j]){
                    System.out.println(i+"-"+j);
                    swap(nums,i,j);
                    break;
                }
            }
        }
        Arrays.sort(nums,i+1,nums.length);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}