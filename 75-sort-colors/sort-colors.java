class Solution {
    public void sortColors(int[] nums) {
        int first=0;
        int mid=0;
        int last=nums.length-1;
        while(mid<=last){
            if(nums[mid]==0){
                int temp=nums[first];
                nums[first]=nums[mid];
                nums[mid]=temp;
                mid++;
                first++;
            }else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[last];
                nums[last]=temp;
                last--;
            }
            else mid++;
            //System.out.println(nums[first] + " "+ nums[mid]+" "+nums[last]);
        }
    }
}