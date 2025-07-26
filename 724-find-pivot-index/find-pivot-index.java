class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) return 0;
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                if(i==0 && suffix[i+1]==0) return 0;
                else if( i==n-1 && prefix[n-2]==0) return n-1;
            }
            else{
                if(prefix[i]==suffix[i]) return i;
            }
        }
        return -1;
    }
}

