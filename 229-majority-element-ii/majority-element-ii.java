class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums == null) return new ArrayList<>();
        int n=nums.length;
        int cnt1=0;
        int cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]) cnt1++;
            else if(el2==nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> arr=new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(el1==nums[i]) cnt1++;
            if(el2==nums[i]) cnt2++;
        }
        int mini =(int)(n/3)+1;
        if(el1==el2) {
            arr.add(el1);
            return arr;
        }
        if(el2<el1){
            if(cnt2>=mini) arr.add(el2);
            if(cnt1>=mini) arr.add(el1);
        }
        else{
            if(cnt1>=mini) arr.add(el1);
            if(cnt2>=mini) arr.add(el2);
        }
        return arr;
        
    }
}