class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num=0, i=0;
        while(num<=nums.length-1){
            if(num!=nums[i]) return num;
            num++;
            i++;
        }
        return num;
    }
}