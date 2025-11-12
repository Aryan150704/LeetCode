class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check=new HashSet<>();

        for(int num: nums){
            if(check.contains(num))return true;
            check.add(num);
            
        }
        return false;
    }
}