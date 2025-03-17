class Solution {
    // Function to check if it's possible to divide the array into pairs such that each pair contains equal numbers.
    public boolean divideArray(int[] nums) {
        // Create an array to count the frequency of elements.
        // The maximum value for any element is considered to be 500, hence an array of size 510 is created for safe margin.
        int[] count = new int[510];
      
        // Iterate over the input array to count the frequency of each element.
        for (int num : nums) {
            // Increment the count of the current element.
            count[num]++;
        }
      
        // Iterate over the frequency array to check if all elements have an even count.
        for (int frequency : count) {
            // If an element has an odd count, we cannot divide the array into pairs with equal numbers.
            if (frequency % 2 != 0) {
                return false; // Return false as soon as an odd frequency is found.
            }
        }
      
        // If all elements have even counts, return true indicating that division into pairs is possible.
        return true;
    }
}