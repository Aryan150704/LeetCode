class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;

        int[] pre =new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i]+pre[i-1];
        }

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int j=0;j<nums.length;j++){
            if(pre[j]==k)count++;
            int val=pre[j]-k;
            if(hm.containsKey(val))count+=hm.get(val);
            hm.put(pre[j],hm.getOrDefault(pre[j],0)+1);
        }
        return count;
    }
}