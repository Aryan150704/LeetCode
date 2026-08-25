import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;

        int l1 = Integer.MAX_VALUE;
        int l2 = Integer.MAX_VALUE;

        for(int num : nums) {
            
            if (m1 < num) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            }
            else if (m2 < num) {
                m3 = m2;
                m2 = num;
            }
            else if (m3 < num) {
                m3 = num;
            }
            
            if (l1 > num) {
                l2 = l1;
                l1 = num;
            }
            else if (l2 > num) {
                l2 = num;
            }
            
        }

        return Math.max(m1 * m2 * m3, m1 * l1 * l2);

                
    }
}