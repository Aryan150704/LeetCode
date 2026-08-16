class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int max=0;
        Map<Integer,Integer> hm =new HashMap<>();
        int[] ans=new int[k];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))hm.put(nums[i],hm.get(nums[i])+1);
            else hm.put(nums[i],1);
            max=Math.max(max,hm.get(nums[i]));
        }
        int fill=ans.length-1;
        for(int i = max; i >= 0 && fill >= 0; i--){
            for(int m : hm.keySet()){
                if(hm.get(m) == i){
                    ans[fill--] = m;
                    if(fill < 0) break;
                }
            }
        }
        return ans;
    }
}