class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rep=target-nums[i];
            if(hm.containsKey(rep)){
                return new int[] {hm.get(rep),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return nums;
    }
}