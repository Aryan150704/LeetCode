class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        Integer num=-1;
        for(int numb : nums){
            if(count==0 && num!=numb){
                num=numb;
            }
            else if(num==numb){
                count++;
            }
            else count--;
        }
        return num;
    }
}