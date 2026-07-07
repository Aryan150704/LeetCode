class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int current=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            if(current==k)count++;
            if(hm.containsKey(current-k)){
                count+=hm.get(current-k);
            }
            hm.put(current,hm.getOrDefault(current,0)+1);
        }
        return count;
    }
}

// in hashmap store frequence 