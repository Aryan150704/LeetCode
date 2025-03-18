class Solution {
    public int longestNiceSubarray(int[] nums) {
        // Initialize the answer to track the length of the longest nice subarray
        int longestNiceLength = 0;

        // Create a bitmask to keep track of the bits in the current subarray
        int currentMask = 0;

        // Two pointers - j represents the start of the current subarray
        // i represents the current end of the subarray being considered
        for (int startIdx = 0, endIdx = 0; endIdx < nums.length; ++endIdx) {
            // Keep removing numbers from the start of the subarray until
            // the current number can fit in without sharing any common set bits
            while ((currentMask & nums[endIdx]) != 0) {
                // XOR operation removes the bits of nums[startIdx] from currentMask
                currentMask ^= nums[startIdx++];
            }

            // Update the longestNiceLength if the current subarray is longer
            longestNiceLength = Math.max(longestNiceLength, endIdx - startIdx + 1);

            // Include the current number's bits into the currentMask
            currentMask |= nums[endIdx];
        }

        // Return the length of the longest nice subarray
        return longestNiceLength;
    }
}
