class Solution {
    private int sizeNums1;
    private int sizeNums2;
    private int[] nums1;
    private int[] nums2;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        sizeNums1 = nums1.length;
        sizeNums2 = nums2.length;
        this.nums1 = nums1;
        this.nums2 = nums2;
        int leftMedian = findKthElement(0, 0, (sizeNums1 + sizeNums2 + 1) / 2);
        int rightMedian = findKthElement(0, 0, (sizeNums1 + sizeNums2 + 2) / 2);
        return (leftMedian + rightMedian) / 2.0;
    }
    private int findKthElement(int startNums1, int startNums2, int k) {
        if (startNums1 >= sizeNums1) {
            return nums2[startNums2 + k - 1]; 
        }
        if (startNums2 >= sizeNums2) {
            return nums1[startNums1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[startNums1], nums2[startNums2]);
        }
        int midIndex = k / 2;
        int midValNums1 = startNums1 + midIndex - 1 < sizeNums1 ? nums1[startNums1 + midIndex - 1] : Integer.MAX_VALUE;
        int midValNums2 = startNums2 + midIndex - 1 < sizeNums2 ? nums2[startNums2 + midIndex - 1] : Integer.MAX_VALUE;
        if (midValNums1 < midValNums2) {
            return findKthElement(startNums1 + midIndex, startNums2, k - midIndex);
        } else {
            return findKthElement(startNums1, startNums2 + midIndex, k - midIndex);
        }
    }
}