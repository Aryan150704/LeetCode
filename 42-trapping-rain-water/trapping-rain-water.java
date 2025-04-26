class Solution {
    public int trap(int[] height) {
        int ans=0;
        int str=0;
        int end=height.length-1;
        int leftmax=0;
        int rightmax=0;
        while(str<end){
            if(height[str]<=height[end]){
                if(height[str]>=leftmax){
                    leftmax=height[str];
                }
                else{
                    ans+=leftmax-height[str];
                }
                str++;
            }
            else{
                if(height[end]>=rightmax){
                    rightmax=height[end];
                }
                else{
                    ans+=rightmax-height[end];
                }
                end--;
            }
        }
        return ans;
    }
}