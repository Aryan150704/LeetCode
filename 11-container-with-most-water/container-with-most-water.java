class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int curr=Math.min(height[r],height[l])*(r - l);
            max=Math.max(curr,max);
            if(height[l]>height[r])
                r--;
            else
                l++;
        }
        return max;
    }
}