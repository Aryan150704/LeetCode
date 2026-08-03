class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st =new HashSet<>();
        for(int i:nums){
            if(!st.add(i))return true;
        }
        return false;
    }
}