class Solution {
    public int subarraysWithKDistinct(int[] nums, int k){
        return  atMost(nums,k)- atMost(nums,k-1);
    }
    public int atMost(int[] nums, int k) {
        if(k==0)return 0;
        int ans=0;
        HashMap<Integer,Integer> hm =new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(hm.size()>k){
                hm.put(nums[j],hm.get(nums[j])-1);
                if(hm.get(nums[j])==0)
                hm.remove(nums[j]);
                j++;
            }
            ans+=i-j+1;
        }
        return ans;
    }
}