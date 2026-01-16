class Solution {
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length;i++){

            // loop 0 
            int count=0;
            for(int m=1;m<nums.length;m++){
                if(nums[m]>=nums[m-1])count++;
            }
            if(count==nums.length-1) return true;

            // loop 1 
            int dummy=nums[0]; // 1
            for(int m=0;m<nums.length-1;m++){
                nums[m]=nums[m+1];
                System.out.print(nums[m]+" "+nums[m+1]+"|");
            }
            nums[nums.length-1]=dummy;

            //loop 2
            count=0;
            for(int m=1;m<nums.length;m++){
                if(nums[m]>=nums[m-1])count++;
            }
            if(count==nums.length-1) return true;
        }
        return false;
    }
}
// 2 1 3 4
// 1 3 4 2
// 3 4 2 1
//

// 4 2 1 3
// 3 4 2 1
// 1 3 4 2

