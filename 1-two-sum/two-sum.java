class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hh=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int component=target-nums[i];
            if(hh.containsKey(component)) return new int[] {hh.get(component),i};
            else hh.put(nums[i],i);
        }
        return nums;
    }
}