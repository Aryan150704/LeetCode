class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        hp.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int n=0;
            n=target-nums[i];
            if(hp.containsKey(n)){
                return new int[]{i,hp.get(n)};
            }else hp.put(nums[i],i);
        }
        return nums;
    }
}