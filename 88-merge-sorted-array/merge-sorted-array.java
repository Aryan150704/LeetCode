class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int values=nums1.length-1;
        while(values>=0 && i>=0 && j>=0){
            if(nums1[i]>nums2[j] ){
                nums1[values]=nums1[i--];
            }
            else{
                nums1[values]=nums2[j--];
            }
            values--;
        }
        if(i>j){
            while(i>=0)
            nums1[values--]=nums1[i--];
        }
        else {
            while(j>=0)
            nums1[values--]=nums2[j--];
        }
            
    }
}