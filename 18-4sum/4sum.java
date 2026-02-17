class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
                int left=i+1;
                
            for(left=i+1;left<nums.length-2;left++){
                if(left>i+1 && nums[left]==nums[left-1])continue;
                int l2=left+1;
                int right=nums.length-1;
                while(l2<right){
                    long sum = (long) nums[i] + nums[left] + nums[l2] + nums[right];
                    if(sum==target){
                        arr.add(Arrays.asList(nums[i],nums[left],nums[l2],nums[right]));

                        while(l2<right && nums[l2]==nums[l2+1]) l2++;
                        while(l2<right && nums[right]==nums[right-1]) right--;
                        l2++;
                        right--;
                    }
                    else if(sum>target) right--;
                    else l2++;
                }
            }
        }
        return arr;
    }
}