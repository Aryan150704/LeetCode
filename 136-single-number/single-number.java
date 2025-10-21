class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num: nums){
            System.out.print(result+" ");
            result = result ^ num ; 
            System.out.print(result+" ,");
        }
        return result ;
    }
}