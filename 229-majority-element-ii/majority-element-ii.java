class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int t1=Integer.MIN_VALUE;
        int t2=Integer.MIN_VALUE;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<nums.length;i++){
            if(ct1==0 && nums[i]!=t2){
                t1=nums[i];
                ct1=1;
            }
            else if (nums[i]==t1){
                ct1++;
            }
            else if(ct2==0 && nums[i]!=t1){
                t2=nums[i];
                ct2=1;
            }
            
            else if(nums[i]==t2){
                ct2++;
            }
            else{
                ct1--;
                ct2--;
            } 
        }
        ct1=0;
        ct2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t1)ct1++;
            if(nums[i]==t2)ct2++;
        }
        if(ct1>nums.length/3 && ct2>nums.length/3){
            if(t1>t2){
                arr.add(t2);
                arr.add(t1);
            }
            else{
                arr.add(t1);
                arr.add(t2);
            }
        }
        else if(ct1>nums.length/3) arr.add(t1);
        else if(ct2>nums.length/3) arr.add(t2);
        return arr;
    }
}