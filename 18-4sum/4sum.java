class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> l=new ArrayList<>();
        
        Map<Integer,Integer> map=new HashMap<>();
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++ ){
            for(int a=i+1;a<nums.length;a++){
                for(int b=a+1;b<nums.length;b++){
                    long sum=(long)nums[a]+nums[b]+nums[i];
                    long k=(long)target-sum;
                    if(k >= Integer.MIN_VALUE &&
    k <= Integer.MAX_VALUE && map.containsKey((int)k) && map.get((int)k)>b){
                        List<Integer> ll=new ArrayList<>();
                            ll.add(nums[i]);
                            ll.add(nums[a]);
                            ll.add(nums[b]);
                            ll.add((int)k);
                            if(!set.contains(ll)){
                                l.add(ll);
                                set.add(ll);
                            }  
                    }
                }
            }
        }
        
        return l;

    }
}