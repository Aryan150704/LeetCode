class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        int[] count = new int[101]; 
        for (int number : nums) {
            goodPairs += count[number];
            count[number]++;
        }
      
        return goodPairs; 
    }
}
