class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]==0?-1:1;
            if(sum==0)max=i+1;
            if(hm.containsKey(sum)){
                max=Math.max(max,i-hm.get(sum));
            }

            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return max;
    }
}