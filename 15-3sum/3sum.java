class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int a=0;a<nums.length;a++){
            for(int b=a+1;b<nums.length;b++){
                if(map.containsKey(-1*(nums[a]+nums[b])) && map.get(-1*(nums[a]+nums[b]))>b){
                    
                    List<Integer> ll=new ArrayList<>();
                        ll.add(nums[a]);
                        ll.add(nums[b]);
                        ll.add(-1*(nums[a]+nums[b]));
                        if(!set.contains(ll)){
                            l.add(ll);
                            set.add(ll);
                        }  
                }
            }
        }
        return l;
    }
} 