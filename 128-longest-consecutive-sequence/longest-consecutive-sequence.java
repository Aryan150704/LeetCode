class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int max=0;

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        for(int num:hs){
            if(!hs.contains(num-1)){
                int count=1;
                int current=num;
                while(hs.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(count,max);
            }
                
        }
        return max;
    }
}