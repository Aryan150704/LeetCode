class Solution {
    public int[] twoSum(int[] nums, int k) { 
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int num=k-nums[i];
            if(hm.containsKey(num)){
                return new int[]{hm.get(k-nums[i]),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return nums;
    }
}