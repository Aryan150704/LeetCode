class Solution {
    public int[] twoSum(int[] number, int target) {
        int i=0;
        int j=number.length-1;
        while(i<j){
            int sum=number[i]+number[j];
            if(sum==target){
                return new int[] {i+1,j+1};
            }
            else if(sum>target) j--;
            else i++;
        }
        return number;
    }
}