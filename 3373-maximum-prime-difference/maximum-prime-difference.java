
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                if (first == -1) first = i;
                last = i;
            }
        }

        return last - first;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
