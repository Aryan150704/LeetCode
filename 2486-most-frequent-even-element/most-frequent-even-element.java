class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
                if(max==0 && nums[i]%2==0)max=1;
            }
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
                if(nums[i]%2==0)
                max=Math.max(max,hm.get(nums[i]));
            }
        }
        if(max==0)return -1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && hm.get(nums[i])==max)ans=Math.min(ans,nums[i]);
        }
        return ans;
        
    }
}