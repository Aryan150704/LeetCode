class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            result.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = result.get(i);
        }
        
        return target;
    }
}